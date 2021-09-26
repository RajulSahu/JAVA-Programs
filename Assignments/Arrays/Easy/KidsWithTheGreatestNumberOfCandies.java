package com.rajul;

import java.util.*;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        System.out.println(ans);
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
        List<Boolean> result = new ArrayList<>();
        int max = getMax(candies);
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies >= max){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
    static int getMax(int[] candies){
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if(candies[i] > max){
                max = candies[i];
            }
        }
        return max;
    }
}
