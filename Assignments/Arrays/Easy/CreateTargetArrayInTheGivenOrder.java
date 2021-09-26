package com.rajul;

import javax.crypto.spec.PSource;
import java.util.*;

public class CreateTargetArrayInTheGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }
    static int[] createTargetArray(int[] nums, int[] index){
        ArrayList<Integer> arr = new ArrayList<>();
        int[] ans = new int[nums.length];
        for (int i = 0; i < index.length; i++) {
            arr.add(index[i], nums[i]);
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
