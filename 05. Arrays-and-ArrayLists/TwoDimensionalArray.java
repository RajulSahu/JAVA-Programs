package com.rajul;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaring a 2-d array
        int[][] arr2d = new int[3][]; // Specifying number of columns is not mandatory but specifying number of rows is mandatory.
        // initializing a 2-d array
        int[][] nums = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // Taking input from user
        int[][] arr = new int[3][3];
        // Input :-
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }
        // Output :-
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

    }
}
