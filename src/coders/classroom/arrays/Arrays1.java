package coders.classroom.arrays;

import java.util.Scanner;

public class Arrays1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Enter target:");
        int target = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }
}
