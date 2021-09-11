package com.rajul;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int age = sc.nextInt();
        System.out.println(canVote(age) ? "Yes, can vote." : "Sorry you are too young to vote.");
    }
    static boolean canVote(int age){
        return (age >= 18);
    }
}
