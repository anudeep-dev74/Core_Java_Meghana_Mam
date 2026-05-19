package practice.arrays;

import java.util.Scanner;

public class DynamicJaggedArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter rows");
        int rows = input.nextInt();

        int[][] jag_arr = new int[rows][];
        for (int i = 0; i < rows; i++) {
            System.out.println("enter the columns for each row " + i);
            int columns = input.nextInt();
            jag_arr[i] = new int[columns];
        }

        System.out.println("enter the elements ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jag_arr[i].length; j++) {
                jag_arr[i][j] = input.nextInt();
            }
        }

        System.out.println("jagged array is - ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < jag_arr[i].length; j++) {
                System.out.print(jag_arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
