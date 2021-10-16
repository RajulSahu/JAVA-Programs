package com.rajul;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }
    static int singleNonDuplicate(int[] nums) {
        if(nums.length == 1) return nums[0];
        int start = 0;
        int end = nums.length-1;
        if (nums[start] != nums[start+1]) return nums[start];
        if (nums[end] != nums[end-1]) return nums[end];
        while (start <= end) {
            int mid = start +(end-start) / 2;
            if (nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            if ((nums[mid-1] == nums[mid] && mid%2 != 0) || (nums[mid+1] == nums[mid] && mid%2 == 0)){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    static int singleNonDuplicate2(int[] nums){
        if(nums.length == 1) return nums[0];
        int start = 0;
        int end = nums.length-1;
        if (nums[start] != nums[start+1]) return nums[start];
        if (nums[end] != nums[end-1]) return nums[end];
        while (start <= end){
            int mid = start +(end-start) / 2;
            if (nums[mid] != nums[mid+1] && nums[mid] != nums[mid-1]){
                return nums[mid];
            }
            else if (nums[mid] == nums[mid-1]){
                // start to mid & mid+1 to end
                int leftCount = mid - start + 1;
                if (leftCount % 2 == 0) {
                    start = mid + 1;
                }
                else {
                    end = mid - 2;
                }
            }
            else if (nums[mid] == nums[mid+1]){
                // start to mid-1 & mid to end
                int rightCount = end - mid + 1;
                if (rightCount%2==0){
                    end = mid - 1;
                }
                else{
                    start = mid + 2;
                }
            }
        }
        return -1;
    }
}
