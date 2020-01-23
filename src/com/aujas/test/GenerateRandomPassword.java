package com.aujas.test;

import java.util.Random;

public class GenerateRandomPassword {
    public static void main(String[] args) {
        // 1. store regex list into array
        // 2. get the random length of the string and range should be provided by client
        // based on the number of regex let decide how we can take the repetition of particular regex.
        // First take all the the character once from all the regex
        String[] regexList = new String[]{"abcdefghijklmnopqrstuvwxyz","ABCDEFGHIJKLMNOPQRSTUVWXYZ",
                                            "0123456789","@#$%!^&?-_~)(*"};
       /* regexList[0] = "abcdefghijklmnopqrstuvwxyz";
        regexList[1] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        regexList[2] = "0123456789";
        regexList[3] = "@#$%!^&?-_~)(*";*/

        Random random = new Random();
        int Length = random.nextInt(20);
        int passwordLength = Length>8? Length:8;
        System.out.println("Required password length "+ passwordLength);

        StringBuilder password = new StringBuilder();
        for (int i =0;i<regexList.length;i++)password.append(regexList[i].charAt(random.nextInt(regexList[i].length())));
        int randamIndex;
        for (int i =0;i<passwordLength-regexList.length;i++) {
            randamIndex = random.nextInt(regexList.length);
            System.out.println("randamIndex "+randamIndex);
            password.append(regexList[randamIndex].charAt(random.nextInt(regexList[randamIndex].length())));
        }
        System.out.println("Password is : "+password +" and its length "+ password.length() );
        }
    }

