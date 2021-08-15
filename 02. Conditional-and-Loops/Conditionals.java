package com.rajul;
import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary to calculate the Bonus: ");
        int salary = input.nextInt();

        if(salary > 10000){
            System.out.println("Bonus will be ₹2000");
        }
        else{
            System.out.println("Bonus will be ₹1000");
        }
    }
}
