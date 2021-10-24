package com.rajul;

public class NumberExampleRecursion {
    public static void main(String[] args){
        // write a function that takes in a number and prints it.
        // print first 5 numbers: 1 2 3 4 5
        // while you can only call a function only once.
        print(1);
    }
    static void print(int n) {
        // Base condition to prevent infinite recursion.
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        // Recursive call
        print(n + 1);
    }
}
