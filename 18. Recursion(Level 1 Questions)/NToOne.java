package com.rajul;

public class NToOne {

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
        printNToOne(n-1);
    }
}
