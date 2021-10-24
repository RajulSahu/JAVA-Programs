package com.rajul;

// Find the nth Fibonacci Number using Recursion.
// 0 1 1 2 3 5 8 13 21 35 56

public class FibonacciNumbers {
    public static void main(String[] args) {
        int ans = fibonacci(6);
        System.out.println(ans);
    }
    static int fibonacci(int n){
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
