package com.rajul;

import java.util.Arrays;

public class MaximumPopulationYear {
    public static void main(String[] args) {
        int[][] logs = {{1993,1999}, {2000,2010}};
        int ans = maximumPopulation1(logs);
        System.out.println(ans);
    }
    static int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                arr[j - logs[0][0]]++;
            }
        }
        int maxVal = 0;
        int maxYear = logs[0][0];
        for (int i = 0; i < 101; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
                maxYear = i+logs[0][0];
            }
        }
        return maxYear;
    }

    static int maximumPopulation1(int[][] logs) {
        int[] arr = new int[101];
        for (int i = 0; i < logs.length; i++) {
            arr[logs[i][0]-1950]++;
            arr[logs[i][1]-1950]--;
        }
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i-1];
        }
        int maxVal = 0;
        int maxYear = 1950;
        for (int i = 0; i < arr.length; i++) {
            if (maxVal < arr[i]){
                maxVal = arr[i];
                maxYear = i + 1950;
            }
        }
        return maxYear;
    }

}
