package practice.arrays;

import java.util.Arrays;

public class JaggedArray {
    static void main(String[] args) {
        int rows = 3;
        int[][] arr = new int[rows][];
        arr[0] = new int[3];
        arr[1] = new int[1];
        arr[2] = new int[2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[2][0] = 5;
        arr[2][1] = 6;
        System.out.println(Arrays.deepToString(arr));
    }
}
