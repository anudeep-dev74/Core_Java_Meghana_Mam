package coders.classroom.arrays;

import java.util.Scanner;

public class MergeArrays {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = input.nextInt();
        System.out.println("Enter the columns");
        int columns = input.nextInt();

        int[][] A = new int[rows][columns];
        int[][] B = new int[rows][columns];
        /*int[][] C = new int[rows * 2][columns];*/
        int[][] C = new int[rows][columns * 2];

        System.out.println("Enter A matrix ");
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter B matrix");
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                B[i][j] = input.nextInt();
            }
        }

        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                C[i][j] = A[i][j];
            }
        }

        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                //C[i][columns + j] = B[i][j];
                C[i][columns + j] = B[i][j];
            }
        }

        for(int[] col: C){
            for(int val: col){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
