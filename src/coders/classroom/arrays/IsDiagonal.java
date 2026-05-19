package coders.classroom.arrays;

import java.util.Scanner;

public class IsDiagonal {
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

        boolean isDiagonal = false;

        if(rows != columns){
            System.out.println("Not a diagonal Matrix");
        }

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if(i != j && arr[i][j] != 0){
                    isDiagonal = false;
                    break;
                }
            }
        }
        if(isDiagonal){
            System.out.println("Diagonal Matrix");
        }else {
            System.out.println("Not a Diagonal Matrix");
        }
    }
}
