package com.rajul;

import java.util.*;

public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {1,2};
        int[] bobSizes = {2,3};
        int[] ans = fairCandySwap(aliceSizes, bobSizes);
        System.out.println(Arrays.toString(ans));
    }
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        Set<Integer> setB = new HashSet<>();
        int sA = 0;
        for (int n :aliceSizes){
            sA += n;
        }
        int sB = 0;
        for (int n :bobSizes){
            sB += n;
            setB.add(n);
        }
        int delta = (sB - sA)/2;
        int[] ans = new int[2];
        for (int x :aliceSizes){
            if (setB.contains(delta+x)){
                ans[0] = x;
                ans[1] = delta+x;
                break;
            }
        }
        return ans;
    }
}
