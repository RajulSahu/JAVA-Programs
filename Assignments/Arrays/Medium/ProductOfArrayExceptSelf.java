package com.rajul;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans1 = productExceptSelf(nums);
        System.out.println(Arrays.toString(ans1));


        int[] ans2 = productExceptSelfWithoutSpace(nums);
        System.out.println(Arrays.toString(ans2));
    }
    static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] answer = new int[n];
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];

        // For leftProduct array.
        leftProduct[0] = 1;
        int product = 1;
        for (int i = 1; i < n; i++) {
            product *= nums[i-1];
            leftProduct[i] = product;
        }

        // For rightProduct array.
        product = 1;
        rightProduct[n-1] = 1;
        for (int i = n-2; i >= 0; i--) {
            product *= nums[i+1];
            rightProduct[i] = product;
        }

        for (int i = 0; i < n; i++) {
            answer[i] = leftProduct[i] * rightProduct[i];
        }

        return answer;
    }

    static int[] productExceptSelfWithoutSpace(int[] nums){
        int n = nums.length;
        int[] answer = new int[n];

        // For leftProduct.
        answer[0] = 1;
        int product = 1;
        for (int i = 1; i < n; i++) {
            product *= nums[i-1];
            answer[i] = product;
        }

        // For rightProduct.
        product = 1;
        for (int i = n-2; i >= 0; i--) {
            product *= nums[i+1];
            answer[i] = answer[i] * product;
        }

        return answer;
    }
}
