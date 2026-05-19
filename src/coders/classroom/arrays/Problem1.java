package coders.classroom.arrays;

import java.util.Arrays;

public class Problem1 {
    static void main(String[] args) {
        int[] arr = {11,23,99};
        int temp;
        for(int i = 0; i < arr.length-1; i+=2){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
