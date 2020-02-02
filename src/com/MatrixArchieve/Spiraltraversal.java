package com.MatrixArchieve;

public class Spiraltraversal {

    static final int ROW = 3;
    static final int COLUMN = 6;


    public static void spiralPrint(int row, int column,int[][] array){

        int startRow=0,endRow = row-1,startCol=0,endCol=column-1;
        System.out.println("Start row: "+startRow+"end row: "+endRow+"start col:"+startCol+"end col: "+endCol);
        while (startCol<=endRow && startCol<=endCol){
            System.out.println("Start row: "+startRow+" end row: "+endRow+" start col:"+startCol+" end col: "+endCol);
            for (int i = startCol;i<=endCol;i++){
                System.out.print(array[startCol][i]+" ");
            }
            System.out.println();
            startRow++;
            for (int i = startRow;i<=endRow;i++){
                System.out.print(array[i][endCol]+" ");
            }
            System.out.println();
            endCol--;
            if (startRow<endRow){
                for (int i = endCol;i>=startCol;i--){
                    System.out.print(array[endRow][i]+" ");
                }

                System.out.println();
                endRow--;
            }
            if (startCol<endCol){

                for (int i = endRow;i>=startRow;i--){
                    System.out.print(array[i][startCol]+" ");
                }
                startCol++;
                System.out.println();
            }
        }
    }



    public static void main(String[] args) {

        /*
        There will be 4 for loop:-
        1. Iterate from left to right.
        2. Iterate top to bottom.
        3. Iterate left to right.
        4. Iterate through bottom to top.
         */

        int[][] array = { { 1, 2, 3, 4, 5, 6 },
            { 7, 8, 9, 10, 11, 12 },
            { 13, 14, 15, 16, 17, 18 } };

        int i =0,j=0;
        int row = ROW-1,col = COLUMN-1;
        spiralPrint(ROW,COLUMN,array);

    }
}
