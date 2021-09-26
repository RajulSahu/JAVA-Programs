package com.rajul;

import java.util.Arrays;

public class SumUpToZero {
    public static void main(String[] args) {
        int n = 2;
        int[] ans = sumZero(n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] sumZero(int n){
        int[] result = new int[n];
        if (n == 1) return result;
        int index = 0;
        if (n % 2 != 0) {
            for (int i = -(n/2); i <= n/2; i++) {
                result[index] = i;
                index++;
            }
        }
        else{
            for (int i = -(n/2); i <= n/2; i++) {
                if (i != 0) {
                    result[index] = i;
                    index++;
                }
            }
        }
        return result;
    }
}
