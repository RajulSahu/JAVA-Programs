package com.rajul;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base of the triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter Height of the triangle: ");
        double height = sc.nextDouble();
        double area = 1/2.0 * (base * height);
        System.out.printf("The Area is: %.2f", area);
    }
}
