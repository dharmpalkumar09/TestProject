package com.aujas.test.com.sorting;

import java.util.Arrays;

public class QuickSort {

    public static void shiftonPivot(int pivot,int[] array){
        int k =array.length-1;
        int j = array.length;
        int i = 0;
        int pivotElement = array[pivot];
        System.out.println(pivotElement);
        while (i<j && i+1 != j){
            while (array[i]<pivotElement)i++;
            while (array[j-1]>pivotElement) j--;
            int temp = array[j-1];
            array[j-1] = array[i];
            array[i] = temp;

        }
    }

    public static void main(String[] args) {


        int array[] = new int[]{10,80,30,90,40,50,70};
        shiftonPivot(4,array);
        System.out.println(Arrays.toString(array));
    }
}
