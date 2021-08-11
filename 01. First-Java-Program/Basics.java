package com.rajul;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int a = input.nextInt();

        if(a >= 10){
            System.out.println("Hello World!");
        }
        else{
            System.out.println("Bye!");
        }
    }
}
