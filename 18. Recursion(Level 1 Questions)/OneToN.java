package com.rajul;

public class OneToN {
    public static void main(String[] args) {
        int n = 5;
        printOneToN(n);
    }
    static void printOneToN(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        printOneToN(n-1);
        System.out.println(n);
    }
}
