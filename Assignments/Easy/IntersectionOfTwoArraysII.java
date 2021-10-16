package com.rajul;

import java.util.*;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {3,1,2};
        int[] nums2 = {1,1};
        int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (int n : nums1) {
            if (map.containsKey(n)){
                map.put(n, map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }
        }
        for (int n : nums2) {
            if (map.containsKey(n) && map.get(n) > 0){
                ans.add(n);
                map.put(n, map.get(n)-1);
            }
        }
        int[] finalAns = new int[ans.size()];
        int i = 0;
        for(int num : ans){
            finalAns[i] = num;
            i++;
        }
        return finalAns;
    }
}
