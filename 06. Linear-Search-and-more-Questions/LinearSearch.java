package com.rajul;

public class LinearSearch {

    public static void main(String[] args) {
        int[] search_arr = {2,36,5,25,13,56,236,36,99,84,22,12,36,30};
        int target = 79;
        int ans = linearSearch(search_arr, target);
        System.out.println(ans);
    }

    //Search in the array: return index if item found
    //otherwise if item is not found return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
