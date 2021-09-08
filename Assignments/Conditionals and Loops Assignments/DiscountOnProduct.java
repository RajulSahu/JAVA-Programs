package com.rajul;

import java.util.Scanner;

public class DiscountOnProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of the product: ");
        double price = sc.nextDouble();
        System.out.print("Enter discount% on the product: ");
        double disc = sc.nextDouble();
        double finalPrice = price - (price * disc/100);
        System.out.println("Discounted price is: " + finalPrice);
    }
}
