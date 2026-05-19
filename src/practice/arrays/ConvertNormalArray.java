package practice.arrays;

import java.util.Arrays;

public class ConvertNormalArray {
    static void main(String[] args) {
        int[] normal_arr = {1,2,3,4,5,6};
        int[] rows_size = {3, 1, 2};
        int[][] jagged_arr = new int[rows_size.length][];
        int idx = 0;
        /*              0 < 3*/
        for (int i = 0; i < rows_size.length; i++) {
            /* jagged_arr[0]  = new int[0]*/
            jagged_arr[i] = new int[rows_size[i]];
            for (int j = 0; j < rows_size[i]; j++) {

                jagged_arr[i][j] = normal_arr[idx++];
            }
        }
        for(int[] row: jagged_arr){
            System.out.println(Arrays.toString(row));
        }
    }
}
