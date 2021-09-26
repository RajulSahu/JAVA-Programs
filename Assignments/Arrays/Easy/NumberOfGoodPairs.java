package com.rajul;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }
    static int numIdenticalPairs(int[] nums) {
        // Using two pointer technique.
        int a = 0;
        int b = 1;
        int pairs = 0;
        while (a < nums.length-1){
            if (nums[a] == nums[b]){
                pairs++;
            }
            if (b == nums.length-1){
                a++;
                b = a;
            }
            if (b<nums.length-1){
                b++;
            }
        }
        return pairs;
    }
}
