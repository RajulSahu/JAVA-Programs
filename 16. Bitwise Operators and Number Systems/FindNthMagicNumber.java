package com.rajul;


public class FindNthMagicNumber {
    public static void main(String[] args) {
        int n = 6;
        int ans = 0;
        int temp = n;

        int base = 5;
        while(n > 0){
            int lastDigit = n & 1;
            n = n >> 1;
            ans += base * lastDigit;
            base = base * 5;
        }
        System.out.printf("The %dth Magic Number is: %d", temp, ans);
    }
}
