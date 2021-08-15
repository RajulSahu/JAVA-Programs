package com.rajul;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int max = a;
        if(b>max) {
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println("Largest is: " + max);
    }
}
