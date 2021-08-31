package com.rajul;

public class SearchInRange {

    public static void main(String[] args) {
        int[] search_arr = {2,36,5,25,13,56,236,36,99,84,22,12,36,30};
        int target = 99;
        int start = 0;
        int end = 9;
        int ans = linearSearch(search_arr, target, start, end);
        System.out.println(ans);
    }

    //Search in the string: return index if item found
    //otherwise if item is not found return -1
    static int linearSearch(int[] arr,int target, int start_index, int end_index){
        if(arr.length == 0){
            return -1;
        }
        for (int i = start_index; i <= end_index; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
