package coders.assignments.arrays;

import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
//        int[] arr = {1,7,50, 31, 96, 96, 47, 5, 82, 117, 25};
        int[] arr = {176, -272, -272, -45, 269, -327, -945, 176};
        int count = 0;
        for(int i = 0; i < arr.length-1; i++){
            count++;
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(count);
        }
    }
}
