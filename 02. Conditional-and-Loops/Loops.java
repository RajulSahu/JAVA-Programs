package com.rajul;
import java.util.Scanner;


public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to print all natural numbers up to that number: ");
        int n = input.nextInt();

        // For loop
        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        // While loop
        int i = 1;
        while(i <= n){
            System.out.print(i + " ");
            i += 1;
        }

        System.out.println();

        // Do-While loop
        i = 1;
        do {
            System.out.print(i + " ");
            i++;
        }while(i <= n);
    }
}
