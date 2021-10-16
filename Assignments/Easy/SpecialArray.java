package com.rajul;

public class SpecialArray {
    public static void main(String[] args) {
        int[] nums = {0,4,3,0,4};
        int ans = specialArray(nums);
        System.out.println(ans);
    }
    static int specialArray(int[] nums) {
        int len = nums.length;
        int[] bucket = new int[1001];
        for (int num :nums) {
            bucket[num]++;
        }
        for (int i = 0; i < bucket.length; i++) {
            if(i == len) return i;
            len -= bucket[i];
        }
        return -1;
    }
}
