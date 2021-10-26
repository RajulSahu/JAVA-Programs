package com.rajul;

public class PrimeNumber {

    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i < 20; i++) {
            System.out.println(i + " is " + (isPrime(i) ? "Prime":"Not Prime"));
        }
    }
    static boolean isPrime(int n) {
        if (n <= 1) return false;

        int c = 2;
        while (c * c <= n){
            if (n % c == 0) return false;
            c++;
        }
        return true;
    }
}
