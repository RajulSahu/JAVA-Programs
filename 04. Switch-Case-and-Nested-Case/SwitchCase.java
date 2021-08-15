package com.rajul;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a fruit name: ");
        String fruit = sc.next();

        switch(fruit){
            case "Mango":
                System.out.println("King of fruits.");
                break;
            case "Apple":
                System.out.println("A sweet red fruit.");
                break;
            case "Orange":
                System.out.println("A sweet and sour fruit.");
                break;
            case "Grapes":
                System.out.println("Small fruit.");
                break;
            default:
                System.out.println("Please enter a valid fruit.");
        }
    }
}
