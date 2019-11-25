package com.aujas.test.com.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void mergeArray(int[] mainArray,int leftIndex, int middleIndex ,int rightIndex){

        int leftarrayLength = middleIndex-leftIndex+1;
        int rightArrayLength = rightIndex-middleIndex;
        int[] leftarray = new int[leftarrayLength];
        int[] rightArray = new int[rightArrayLength];

        for (int i=0;i<leftarrayLength;i++){
            leftarray[i] = mainArray[leftIndex+i];
        }
        for (int i = 0;i<rightArrayLength;i++){
            rightArray[i] = mainArray[middleIndex+1+i];
        }
        System.out.println();
        int i = 0,j = 0;
        int k = leftIndex;
        while (i<leftarrayLength && j <rightArrayLength){

            if (leftarray[i] <= rightArray[j]){
                // add left value to array and increase i
                mainArray[k] =leftarray[i];
                i++;
            }else{
                mainArray[k] = rightArray[j];
                j++;
            }
                k++;
        }

        // add remaining to main array

        while (i< leftarrayLength){
            mainArray[k] = leftarray[i];
            i++;
            k++;
        }
        while (j < rightArrayLength){
            mainArray[k] = rightArray[j];
            j++;
            k++;
        }
           // return mainArray;
    }

    public static void mergeTwoSortedArray(int[] array,int left, int right){

        if(left < right){

            int m = (right +left)/2;
            mergeTwoSortedArray(array,left,m);
            mergeTwoSortedArray(array,m+1,right);
            mergeArray(array,left,m,right);

        }
        //return array;
    }

    public static void main(String[] args) {
        int array[] = new int[]{2,19,5,2};
        mergeTwoSortedArray(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
