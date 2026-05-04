package coders.classroom.wrapper_classes;

import java.util.Scanner;

public class PhoneNumber {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        Long phoneNumber = Long.parseLong(s);
        if(phoneNumber < 1000000000  || phoneNumber > 999999999){
            System.out.println("Invalid Phone Number");
        }else {
            System.out.println("Valid Phone Number");
        }
    }
}
