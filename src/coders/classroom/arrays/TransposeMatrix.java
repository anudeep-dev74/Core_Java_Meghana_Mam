package coders.classroom.arrays;

import java.util.Scanner;

public class TransposeMatrix {
    static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the rows");
       int rows = input.nextInt();
       System.out.println("Enter the columns");
       int columns = input.nextInt();
       int[][] arr = new int[rows][columns];
        System.out.println("Enter the matrix");
       for(int i = 0; i < rows; i++){
           for (int j = 0; j < columns; j++) {
               arr[i][j] = input.nextInt();
           }
       }
       int[][] transpose_matrix = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose_matrix[j][i] = arr[i][j];
            }
        }

        System.out.println("Transpose Matrix ");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
