package practice.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class JaggedArrays2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter rows");
        int rows = input.nextInt();
        int[][] arr = new int[rows][];

        for (int i = 0; i < rows; i++) {
            arr[i] = new int[i+1];
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                arr[i][j] = (i+1) * (j+1);
            }
        }

        System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
