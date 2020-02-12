package com.MatrixArchieve;
/*
The rotation will be clockwise
One cycle of rotation
 */
public class RotateMatrix {

    static final int ROW = 3;
    static final int COLUMN = 6;

    public static int[][] rotateMatrix(int row, int col, int[][] array){
        int startRow = 0,endRow = row,startCol = 0,endCol = col;
        int current;
        while (startRow<= endRow && startCol<=endCol){
            int previous = array[startRow+1][startCol];
            for (int i =startRow;i<=endCol;i++){
                current = array[startRow][i];
                array[startRow][i] = previous;
                previous = current;
            }
            startRow++;

            for (int i = startRow;i<=endRow;i++){
                current = array[i][endCol];
                array[i][endCol] = previous;
                previous = current;
            }
            endCol--;

            if (startCol<endCol){
                for (int i =endCol;i>=startCol;i--){
                    current = array[endRow][i];
                    array[endRow][i] = previous;
                    previous = current;
                }
                endRow--;
            }

            if (startRow<endRow){
                for (int i = endRow;i>=startRow;i--){
                    current = array[i][startCol];
                    array[i][startCol] = previous;
                    previous = current;
                }
                startCol++;
            }
        }
        return array;

    }
    public static void main(String[] args) {

        int[][] array = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };

        int i =0,j=0;
        int row = ROW-1,col = COLUMN-1;
        System.out.println("Matrixx before rotate");
        printMatrix(array);
        array = rotateMatrix(row,col,array);
        System.out.println("Matrix after rotate");
        printMatrix(array);

    }

    public static void printMatrix(int[][] array){
        for (int i =0;i<ROW;i++){
            for (int j = 0;j<COLUMN;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
}
