package coders.classroom.arrays;

import java.util.Scanner;

public class FindMinMax {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = input.nextInt();
        System.out.println("Enter the columns");
        int columns = input.nextInt();
        int[][] arr = new int[rows][columns];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                arr[i][j] = input.nextInt();
            }
        }
        int min = arr[0][0];
        int max = arr[0][0];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(min > arr[i][j]){
                    min = arr[i][j];
                }else if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Maximum element" + max);
        System.out.println("Minimum element" + min);
    }
}
