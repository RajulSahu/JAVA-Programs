package com.rajul;

import java.util.*;


public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicate(nums);
        System.out.println(ans);
        System.out.println(Arrays.toString(nums));
    }
    static List<Integer> findDuplicate(int[] nums){
        int i = 0;
        int temp;
        List<Integer> ans = new ArrayList<>();
        while(i < nums.length){
            int correct_index = nums[i] - 1;
            if(nums[i] != nums[correct_index]){
                temp = nums[i];
                nums[i]= nums[correct_index];
                nums[correct_index] = temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(j != nums[j]-1){
                ans.add(nums[j]);
            }
        }
        return ans;
    }
}
