package com.rajul;

import java.util.Arrays;

public class MaxValueInArray {
    public static void main(String[] args) {
        int[] arr = {3, 30, 56, 52, 10};
        System.out.println(Arrays.toString(arr));
        int maximum = maxValue(arr);
        System.out.println(maximum);
    }
    static int maxValue(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
