package coders.classroom.arrays;

import java.util.Scanner;

public class DiagonalElements {
    public int[] findDiagonalOrder(int[][] mat){
        if(mat == null || mat.length == 0 || mat.length == 0)
            return null;
        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, column = 0, idx = 0;
        boolean upwards = true; // true is for up-right, false is for down-right
        while(idx < m * n){
            result[idx++] = mat[row][column];

            if(upwards) {
                if(column == n-1){
                    row++;
                    upwards = false;
                }else if(row == 0){
                    column++;
                    upwards = false;
                }else {
                    row--; column++;
                }
            }else {
                if(row == m - 1){
                    column++;
                    upwards = true;
                }else if(column == 0){
                    row++;
                    upwards = true;
                }else {
                    row++; column--;
                }
            }
        }
        return result;

    }
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

        DiagonalElements obj = new DiagonalElements();
        int[] result = obj.findDiagonalOrder(arr);
        System.out.println("Diagonal elements are ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        input.close();
    }
}
