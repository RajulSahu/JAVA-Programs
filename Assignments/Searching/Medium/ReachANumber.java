package com.rajul;

public class ReachANumber {
    public static void main(String[] args) {
        int target = 2;
        int ans = reachNumber(target);
        System.out.println(ans);
    }
    static int reachNumber(int target) {
        if (target == 0) return 0;
        int sum = 0;
        int steps = 0;
        target = Math.abs(target);

        while (sum < target) {
            sum += steps;
            steps++;
        }
         while ((sum-target) % 2 != 0) {
             sum += steps;
             steps++;
         }
         return steps-1;
    }
}
