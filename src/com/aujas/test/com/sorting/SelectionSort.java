package com.aujas.test.com.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static int[] getMinimum(int[] elements,int startIndex){

        if (elements.length>0) {
            int minimum = elements[startIndex];
            int swapIndex = startIndex;
            for (int i = startIndex+1; i < elements.length; i++) {
                if (minimum > elements[i]) {
                    swapIndex = i;
                    minimum = elements[i];
                }
                }

                if (swapIndex!=startIndex){
                    int temp = elements[startIndex];
                    elements[startIndex] = minimum;
                    elements[swapIndex] = temp;
                }
            }

        return elements;
    }
    public static void main(String[] args) {
        int unsortedData[] = new int[]{2,9,4,5,3,2};
         for (int i =0; i<unsortedData.length;i++){

            unsortedData = getMinimum(unsortedData,i);
        }
        System.out.println(Arrays.toString(unsortedData));


    }

}
