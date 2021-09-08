package com.rajul;
import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        int r = sc.nextInt();
        double area = Math.PI * (Math.pow(r, 2));
        System.out.printf("The Area is: %.2f", area);
    }
}
