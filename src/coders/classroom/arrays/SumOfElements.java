package coders.classroom.arrays;

import java.util.Scanner;

public class SumOfElements {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = input.nextInt();
        System.out.println("Enter the columns");
        int columns = input.nextInt();
        int[][] arr = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = input.nextInt();
            }
        }


        for(int j = 0; j < arr[0].length; j++){
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of row " + j + " = " + sum);
        }
    }
}