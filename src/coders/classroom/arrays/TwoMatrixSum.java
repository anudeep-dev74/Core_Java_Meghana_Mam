package coders.classroom.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoMatrixSum {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows...");
        int rows = input.nextInt();
        System.out.println("Enter the columns");
        int columns = input.nextInt();

        int[][] A = new int[rows][columns];
        int[][] B = new int[rows][columns];
        int[][] sum = new int[rows][columns];

        System.out.println("Enter A matrix");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter B matrix");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                B[i][j] = input.nextInt();
            }
        }

        System.out.println("Sum of A & B matrix");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                sum[i][j] = A[i][j] + B[i][j];
            }
        }
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
