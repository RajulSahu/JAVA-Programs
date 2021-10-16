package com.rajul;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        for (int n : nums1) {
            set.add(n);
        }
        for(int value : nums2){
            if(set.contains(value)){
                ans.add(value);
                set.remove(value);
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
