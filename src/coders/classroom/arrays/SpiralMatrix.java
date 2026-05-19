package coders.classroom.arrays;

import java.util.Scanner;

public class SpiralMatrix {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("rows - ");
        int r = input.nextInt();
        System.out.println("columns - ");
        int c = input.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("enter the matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        /*
        * top_row 1  2  3  4  5
        *         6  7  8  9  10
        *         11 12 13 14 15
        *         16 17 18 19 20
        * bot_row 21 22 23 24 25
        *         lc          rc
        * */
        int top_row = 0, bottom_row = r - 1, left_col = 0, right_col = c - 1;
        int total_elements = 0;

        while(total_elements < r * c){
            // top_row = left_col to right_col
            for(int j = left_col; j <= right_col && total_elements < r * c; j++){
                System.out.print(arr[top_row][j] + " ");
                total_elements++;
            }
            top_row++;
            // right_col = top_row to bottom_row
            for(int i = top_row; i <= bottom_row && total_elements < r * c; i++){
                System.out.print(arr[i][right_col] + " ");
                total_elements++;
            }
            right_col--;
            // bottom row = right_col to left_col
            if(top_row <= bottom_row) {
                for (int j = right_col; j >= left_col && total_elements < r * c; j--) {
                    System.out.print(arr[bottom_row][j] + " ");
                    total_elements++;
                }
                bottom_row--;
            }
            // left_col = bottom_row to top_row
            if(left_col <= right_col) {
                for (int i = bottom_row; i >= top_row && total_elements < r * c; i--) {
                    System.out.print(arr[i][left_col] + " ");
                    total_elements++;
                }
                left_col++;
            }
        }

    }
}
