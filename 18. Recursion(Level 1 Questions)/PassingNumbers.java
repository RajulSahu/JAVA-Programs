package com.rajul;

public class PassingNumbers {
    public static void main(String[] args) {
        int n = 5;
        printNToOne(n);
    }
    static void printNToOne(int n){
        if (n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
//        printNToOne(n--); // This will pass the value of n first and then subtract which will led to infinite recursion.
        printNToOne(--n); // This will subtract the value of n first and then pass the subtracted value.
    }
}
