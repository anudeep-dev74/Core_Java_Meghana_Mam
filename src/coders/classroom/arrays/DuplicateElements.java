package coders.classroom.arrays;

import java.util.Arrays;

public class DuplicateElements {
    static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6,7};
        int unique_ele = arr.length;

        for(int i = 0; i < unique_ele; i++){
            for(int j = i+1; j < unique_ele; j++){
                if(arr[i] == arr[j]){
                    arr[j] = arr[unique_ele-1];
                    unique_ele--;
                    j--;
                }
            }
        }
        int[] arr1 = Arrays.copyOf(arr, unique_ele);

        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
