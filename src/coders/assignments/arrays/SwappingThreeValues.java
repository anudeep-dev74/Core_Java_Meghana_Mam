package coders.assignments.arrays;

import java.util.Arrays;

public class SwappingThreeValues {
    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40,50, 60, 70};

        for(int i = 0; i + 2 < arr.length; i+=3){
            int temp = arr[i];
            arr[i] = arr[i+2];
            arr[i+2] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
