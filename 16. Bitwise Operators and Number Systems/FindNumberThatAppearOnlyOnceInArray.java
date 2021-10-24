package com.rajul;


// Except one element all the element appears exactly twice in the array
// The task is to find that number that appears only once.
public class FindNumberThatAppearOnlyOnceInArray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,1,2,1,3,6,4};
        int ans = occursOnlyOnce(nums);
        System.out.println(ans);
    }
    static int occursOnlyOnce(int[] nums) {
        int unique = 0;

        for (int n : nums){
            unique ^= n;
        }
        return unique;
    }
}
