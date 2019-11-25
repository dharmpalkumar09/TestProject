package com.aujas.test.com.sorting;

import java.util.Arrays;

public class SortBinaryArray {
    public static void main(String[] args) {
        int array[] =new int[]{1,0,1,0,1,0,1,0,1,0};

        // Use pivot concept to sort this array
        int k =-1;
        for (int i=0;i<array.length;i++){
            if (array[i]<1){
                k++;
                int temp = array[k];
                array[k] = array[i];
                array[i] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
