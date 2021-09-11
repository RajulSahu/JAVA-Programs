package com.rajul;
import java.util.*;

public class MaxMinFunction {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = findMax(a,b,c);
        int min = findMin(a,b,c);
        System.out.printf("Maximum between %d, %d, %d is: %d \n", a, b, c, max);
        System.out.printf("Minimum between %d, %d, %d is: %d", a, b, c, min);
    }
    static int findMax(int a, int b, int c){
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
    static int findMin(int a, int b, int c){
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }
}
