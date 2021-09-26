package com.rajul;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
        int[][] ans = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(ans));
    }
    static int[][] flipAndInvertImage(int[][] image){
        int imageSize = image.length;
        for (int i = 0; i < imageSize; i++) {
            image[i] = invert(reverse(image[i]));
        }
        return image;
    }
    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    static int[] invert(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        return arr;
    }
}