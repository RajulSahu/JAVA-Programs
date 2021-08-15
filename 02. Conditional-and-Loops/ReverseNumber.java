package com.rajul;
import java.util.Scanner;


public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int n = sc.nextInt();

        int d = 0;
        int r = 0;
        while(n!=0){
            d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        System.out.println("The reversed number is: " + r);
    }
}
