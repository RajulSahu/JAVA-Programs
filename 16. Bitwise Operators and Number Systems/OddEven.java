package com.rajul;

public class OddEven {

    public static void main(String[] args) {
        int n = 68;
        System.out.println(isOdd(n) ? "ODD" : "EVEN");
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}

