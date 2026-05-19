package coders.classroom.arrays;

import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        int count = 0;

        for(int i = 0; i < arr.length-1; i++){
            boolean isswapped = false;
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isswapped = true;
                    count++;
                }
            }
            if(isswapped == false){
                break;
            }
        }

        System.out.println(count);
    }
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
        }
        bubbleSort(arr);
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
    }
}
