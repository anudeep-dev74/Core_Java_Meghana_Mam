package practice.arrays;

import java.util.Arrays;

public class ConvertJagged {
    static void main(String[] args) {
        int[] normal = {1,2,3,4,5,6};
        int[][] jagged_arr = new int[3][];
        jagged_arr[0] = new int[3];
        jagged_arr[1] = new int[1];
        jagged_arr[2] = new int[2];
        int k = 0;
        for(int i = 0; i < jagged_arr.length; i++){
            for (int j = 0; j < jagged_arr[i].length; j++) {
                jagged_arr[i][j] = normal[k++];
            }
        }
        System.out.println(Arrays.deepToString(jagged_arr));
    }
}
