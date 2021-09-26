package com.rajul;

public class FindHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        int ans = largestAltitude(gain);
        System.out.println(ans);
    }
    static int largestAltitude(int[] gain){
        int maxAltitude = 0;
        int currAltitude = 0;
        for (int i = 0; i < gain.length; i++) {
            currAltitude += gain[i];
            maxAltitude = Math.max(currAltitude, maxAltitude);

        }
        return maxAltitude;
    }
}
