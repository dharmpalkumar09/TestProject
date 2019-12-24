package com.aujas.test;

import java.util.Random;

public class GenerateRandomPassword {
    public static void main(String[] args) {
        // 1. store regex list into array
        // 2. get the random length of the string and range should be provided by client
        // based on the number of regex let decide how we can take the repetition of particular regex.
        // First take all the the character once from all the regex
        String[] regex = new String[4];
        regex[0] = "abcdefghijklmnopqrstuvwxyz";
        regex[1] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        regex[2] = "0123456789";
        regex[3] = "@#$%!^&?-_~)(*";

        Random random = new Random();
        int Length = random.nextInt(20);
        int passwordLength = Length>8? Length:8;
        System.out.println("Required password length "+ passwordLength);

        StringBuilder password = new StringBuilder();
        for (int i =0;i<regex.length;i++)password.append(regex[i].charAt(random.nextInt(regex[i].length())));
        int randamIndex;
        for (int i =0;i<passwordLength-regex.length;i++) {
            randamIndex = random.nextInt(regex.length);
            System.out.println("randamIndex "+randamIndex);
            password.append(regex[randamIndex].charAt(random.nextInt(regex[randamIndex].length())));
        }
        System.out.println("Password is : "+password +" and its length "+ password.length() );
        }
    }

