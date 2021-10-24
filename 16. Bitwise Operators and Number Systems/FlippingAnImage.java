package com.rajul;
import java.util.*;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {{1,1,0}, {1,0,1}, {0,0,0}};
        int[][] flippedImage = flipAndInvertImage(image);
        System.out.println(Arrays.deepToString(flippedImage));
    }
    static int[][] flipAndInvertImage(int[][] image) {
     for (int[] row : image) {
         int start = 0;
         int end = row.length - 1;
         while (start <= end) {
             int temp = row[start] ^ 1;
             row[start] = row[end] ^ 1;
             row[end] = temp;
             start++;
             end--;
         }
     }
     return image;
    }
}
