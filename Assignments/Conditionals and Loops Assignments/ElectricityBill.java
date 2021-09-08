package com.rajul;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Units: ");
        int units = sc.nextInt();
        System.out.print("Enter Price per Unit: ");
        int price = sc.nextInt();
        System.out.println("The total bill will be: " + units*price);
    }
}
