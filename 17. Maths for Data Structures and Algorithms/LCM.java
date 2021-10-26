package com.rajul;

//LCM * HCF(GCD) = a * b
// LCM = a * b / HCF

public class LCM {
    public static void main(String[] args) {
        int a = 4;
        int b = 10;
        int ans = lcm(a, b);
        System.out.println(ans);
    }
    static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
    static int gcd(int a, int b) {
        if (a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}
