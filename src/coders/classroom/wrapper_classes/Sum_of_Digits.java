package coders.classroom.wrapper_classes;

import java.util.Scanner;

public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int sum = 0;
        Integer i1 = Integer.parseInt(s);
        for(int i = 0; i < s.length(); i++){
            int digit = i1 % 10;
            sum = sum + digit;
            i1 = i1 / 10;
        }
        System.out.println(sum);
    }
}
