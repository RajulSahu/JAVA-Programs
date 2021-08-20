package com.rajul;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<arr.length; i++){
            System.out.printf("Enter a value for %d index: ", i);
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
