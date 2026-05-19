package coders.classroom.arrays;

import java.util.Scanner;

public class ScalarMatrix {
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

        boolean isScalar = true;

        if(rows != columns){
            System.out.println("Not a Scalar Matrix");
        }

        int diagonalValue = arr[0][0];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){

                if(i != j && arr[i][j] != 0){
                    isScalar = false;
                    break;
                }

                if(i == j && arr[i][j] != diagonalValue){
                    isScalar = false;
                    break;
                }
            }
        }
        if(isScalar){
            System.out.println("Scalar Matrix");
        }else {
            System.out.println("Not a Scalar Matrix");
        }
    }
}
