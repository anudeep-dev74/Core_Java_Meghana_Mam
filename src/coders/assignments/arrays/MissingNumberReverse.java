package coders.assignments.arrays;

import java.util.Scanner;

public class MissingNumberReverse {
    static void main(String[] args) {
        int[] arr = {3, 7, 1, 2, 8, 4};
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i]; // 8
            if(arr[i] < min) min = arr[i]; // 1
        }

        boolean[] ispresent = new boolean[max + 1];
        for(int i = 0; i < arr.length; i++){
            ispresent[arr[i]] = true;
        }

        int[] missing = new int[max - min + 1];
        int index = 0;

        for(int i = min; i <= max; i++){  // [5,6,0,0,0,0]
            if(!ispresent[i]){
                missing[index++] = i;
            }
        }

        // reverse the missing number
        for(int i = index - 1; i >= 0; i--){
            System.out.print(missing[i] + " ");
        }

    }
}
