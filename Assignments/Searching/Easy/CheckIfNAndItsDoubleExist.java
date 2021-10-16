package com.rajul;

import java.util.*;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
//        int[] arr = {-2,0,10,-19,4,6,-8};
        int[] arr = {10,2,5,3};
        boolean ans = checkIfExist(arr);
        System.out.println(ans);
    }
    static boolean checkIfExist(int[] arr){
        ArrayList<Integer> set = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if (arr[i]%2==0){
                if(set.contains(arr[i]*2) || set.contains(arr[i]/2)) return true;
            }
            else{
                if(set.contains(arr[i]*2)) return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
