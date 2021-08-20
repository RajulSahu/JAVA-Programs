package com.rajul;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] a){
        int start = 0;
        int end = a.length-1;
        while(start < end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start ++;
            end --;
        }
    }
}
