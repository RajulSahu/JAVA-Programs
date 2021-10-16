package com.rajul;

public class GuessNumberHigherLower {
    public static void main(String[] args) {
        int n = 100;
        int ans = guessNumber(n);
        System.out.println(ans);
    }
    static int guessNumber(int n) {
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end-start)/2;

            if(guess(mid) == 0) return mid;
            if (guess(mid) == -1) end = mid - 1;
            else start = mid + 1;

        }
        return 0;
    }
    static int guess(int n){
        if (54 > n) return 1;
        if (54 < n) return -1;
        return 0;
    }
}
