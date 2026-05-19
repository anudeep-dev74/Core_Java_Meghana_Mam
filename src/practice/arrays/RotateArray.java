package practice.arrays;

import java.util.Scanner;

public class RotateArray {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows...");
        int row = input.nextInt();
        System.out.println("Enter the columns");
        int column = input.nextInt();

        int[][] arr = new int[row][column];
        System.out.println("Enter the matrix");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                arr[i][j] = input.nextInt();
            }
        }

        int[][] transpose = new int[row][column];
        /*for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                transpose[i][j] = arr[j][i];
            }
        }*/
        for (int i = 0; i < column; i++) {
            for (int j = i; j < row; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("Transpose Matrix");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // reverse the array
        if(row != column){
            System.out.println("rotation requires the sqaure matrix");
        }
        for(int i = 0; i < row; i++){
                int left = 0;
                int right = column - 1;
                while (left < right){
                    int temp = arr[i][left];
                    arr[i][left] = arr[i][right];
                    arr[i][right] = temp;
                    left++;
                    right--;
            }
        }
        System.out.println("Rotated matrix is...");
        for(int i = 0; i < row; i++){
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
