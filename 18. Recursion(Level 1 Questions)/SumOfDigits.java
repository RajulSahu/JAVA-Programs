package com.rajul;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        int fact = digitSum(n);
        System.out.println(fact);
    }
    static int digitSum(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + digitSum(n/10);
    }
}
