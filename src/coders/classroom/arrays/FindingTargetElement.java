package coders.classroom.arrays;

import java.util.Scanner;

public class FindingTargetElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = input.nextInt();
        System.out.println("Enter the columns");
        int columns = input.nextInt();
        boolean isTargetFound = false;
        int[][] arr = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = input.nextInt();
            }
        }

        int target = input.nextInt();
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(arr[i][j] == target) {
                    isTargetFound = true;
                    /*System.out.print("target found at ( " + i  + " , " + j + " ) ");*/
                }
            }
        }
        if(isTargetFound){
            System.out.println("Element Found");
        }else {
            System.out.println("Element Not Found");
        }
        input.close();
    }
}
