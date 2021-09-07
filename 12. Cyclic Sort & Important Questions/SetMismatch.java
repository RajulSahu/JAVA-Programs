package com.rajul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
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
                ans.add(j+1);
            }
        }
        return ans;
    }
}
