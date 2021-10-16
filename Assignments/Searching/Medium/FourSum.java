package com.rajul;
import java.util.*;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> ans = fourSum(nums, target);
        System.out.println(ans);
    }
    static List<List<Integer>> fourSum(int[] nums, int target){
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();

        if (nums.length == 0) return res;

        Arrays.sort(nums);

        int n = nums.length;

        int i = 0;
        while (i < n){

            int j = i + 1;
            while (j < n){
                int targetLeft = target - (nums[i] + nums[j]);

                int left = j + 1;
                int right = n-1;
                while (left < right){
                    int twoSum  = nums[left] + nums[right];
                    if (twoSum < targetLeft){
                        left++;
                    }
                    else if (twoSum > targetLeft){
                        right--;
                    }
                    else {
                        List<Integer> quad= new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[left]);
                        quad.add(nums[right]);
                        res.add(quad);

                        while (left < right && nums[left] == quad.get(2)) left++;

                        while (left < right && nums[right] == quad.get(3)) right--;
                    }
                }
                while (j + 1 < n && nums[j] == nums[j+1]) j++;
                j++;
            }
            while (i + 1 < n && nums[i] == nums[i+1]) i++;
            i++;
        }
        return res;
    }
}
