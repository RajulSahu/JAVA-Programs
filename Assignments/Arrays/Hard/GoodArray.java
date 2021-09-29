package com.rajul;

public class GoodArray {
    public static void main(String[] args) {
        int[] nums = {6,10,15};
        boolean isGood = isGoodArray(nums);
        System.out.println(isGood);
    }
    static boolean isGoodArray(int[] nums){
        int value = nums[0];
        for (int i = 0; i < nums.length; i++) {
            value = calcGCD(value, nums[i]);
            if (value == 1) return true;
        }
        return false;
    }
    static int calcGCD(int a, int b) {
        if (b == 0){
            return a;
        }
        return calcGCD(b, a%b);
    }
    static int calcGCD2(int a, int b){
        int remainder = a % b;
        while (remainder != 0){
            a = b;
            b = remainder;
            remainder = a % b;
        }
        return b;
    }
    static int calcGCD3(int a, int b) {
        if (a < b)
            return calcGCD3(b, a);
        return a % b == 0 ? b : calcGCD3(b, a % b);
    }
}
