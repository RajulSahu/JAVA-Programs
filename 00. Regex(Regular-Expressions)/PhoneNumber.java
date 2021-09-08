package com.rajul;
import java.math.BigInteger;
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Mobile number to check: ");
        String ph = sc.nextLine();
        // Rule 1: Mobile number should contain exact 10 digits.
        // Rule 2: If mobile number contains 11 digits then first digit should be a 0.
        // Rule 3: If mobile number contains 12 digits then first two digits should be 91.
        // Rule 4: The first digit must be 7, 8 or, 9.
//        String exp = "(0|91)?[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]";
                              //or
        String exp = "(0|91)?[7-9][0-9]{9}";
        if(ph.matches(exp)){
            System.out.println("Valid mobile number");
        }
        else{
            System.out.println("InValid mobile number");
        }


    }
}
