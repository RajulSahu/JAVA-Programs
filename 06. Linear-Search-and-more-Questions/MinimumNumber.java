package com.rajul;

public class MinimumNumber {
    public static void main(String[] args) {
        int[] search_arr = {2,36,5,25,13,56,236,36,99,84,22,12,36,30};
        int ans = minimum(search_arr);
        System.out.println(ans);
    }

    //Search a minimum element in the array: return minimum element
    static int minimum(int[] arr){
        if(arr.length == 0){
            System.out.println("Array is empty");
            return 0;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
