package com.rajul;


public class NumberContainsEvenDigitCount {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896,-1253};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums){
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            int noOfDigits = count2(nums[i]);
            if(noOfDigits % 2==0){
                even++;
            }
        }
        return even;
    }

    static int count(int n){
        int c = 0;
        int d = 0;
        while(n!=0){
            d = n%10;
            c++;
            n = n/10;
        }
        return c;
    }
    static int count2(int n){
        return (int)(Math.log10(n)+1);
    }
}
