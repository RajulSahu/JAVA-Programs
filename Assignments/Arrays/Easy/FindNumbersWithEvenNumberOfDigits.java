package com.rajul;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int n : nums){
            if (countDigits(n) % 2 == 0) count++;
        }
        return count;
    }
    static int countDigits(int n){
        return (int)(Math.log10(n)+1);
    }
}