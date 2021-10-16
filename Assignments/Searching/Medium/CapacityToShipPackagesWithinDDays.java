package com.rajul;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int ans = shipWithinDays(weights, days);
        System.out.println(ans);
    }
    static int shipWithinDays(int[] weights, int days) {
        int max = 0;
        int sum = 0;
        for(int weight : weights){
            sum += weight;
            max = Math.max(max, weight);
        }

        int lo = max;
        int hi = sum;
        int ans = 0;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (isPossible(weights, mid, days)){
                ans = mid;
                hi = mid - 1;
            }
            else{
                lo = mid + 1;
            }
        }
        return ans;
    }
    static boolean isPossible(int[] weights, int mid, int days){
        int sum = 0;
        int requiredDays = 1;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            if (sum > mid){
                sum = weights[i];
                requiredDays++;
            }
        }
        return requiredDays <= days;
    }
}
