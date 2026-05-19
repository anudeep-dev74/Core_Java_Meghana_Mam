package dsa;

import java.util.Scanner;

public class Reverse {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int temp = n;
        int count = 0;

        while(temp > 0){
            count++;
            temp /= 10;
        }

        for(int i = 0; i < count; i++){
           int result = n / (int)Math.pow(10, count-1);
            System.out.println(result);
            n = n % (int)Math.pow(10, count-1);
            count--;
            i -= 1;
        }
    }
}
