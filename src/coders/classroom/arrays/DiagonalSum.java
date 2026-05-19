package coders.classroom.arrays;

import java.util.Scanner;

public class DiagonalSum {
    public int diagonalSum(int[][] mat){
        int sum = 0;
        int n = mat.length;

        for(int i = 0; i < n; i++){
            sum += mat[i][i];
            sum += mat[i][n - i - 1];
        }

        if(n % 2 != 0){
            sum -= mat[n/2][n/2];
        }
        return sum;
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
        DiagonalSum dsum = new DiagonalSum();
        System.out.println(dsum.diagonalSum(arr));
    }
}
