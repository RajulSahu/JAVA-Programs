package com.rajul;
import java.util.*;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4,5};
        int[] nums2 = {2,3,4};
        int[] ans = mergeSortedArrays(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
    static int[] mergeSortedArrays(int[] nums1, int[] nums2){
        int i = 0;
        int j = 0;
        int index = 0;
        int[] ans = new int[nums1.length + nums2.length];
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                ans[index] = nums1[i];
                i++;
            }
            else{
                ans[index] = nums2[j];
                j++;
            }
            index++;
        }
        while(i < nums1.length){
            ans[index] = nums1[i];
            i++;
            index++;
        }
        while(j < nums2.length){
            ans[index] = nums1[j];
            j++;
            index++;
        }
        return ans;
    }
}
