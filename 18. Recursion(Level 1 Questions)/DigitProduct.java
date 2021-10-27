package com.rajul;

public class DigitProduct {
    public static void main(String[] args) {
        int n = 1342;
        int fact = digitProd(n);
        System.out.println(fact);
    }
    static int digitProd(int n){
        if(n%10 == n){
            return n;
        }
        return n%10 * digitProd(n/10);
    }
}
