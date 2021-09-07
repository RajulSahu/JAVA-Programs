package com.rajul;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] mountainArr = {0,5,3,1};
        int target = 1;
        int final_ans = ans(mountainArr, target);
        System.out.println(final_ans);

    }

    static int ans(int[] mountainArr, int target){
        int start = 0;
        int end = mountainArr.length - 1;
        int peak_index = findPeak(mountainArr);

        if(target == mountainArr[peak_index]) return peak_index;

        int first_half = binarySearch(mountainArr, target, start, peak_index - 1);
        if(first_half == -1){
            return binarySearch(mountainArr, target, peak_index + 1, end);
        }
        else{
            return first_half;
        }
    }

    static int findPeak(int[] mountainArr){
        int start = 0;
        int end = mountainArr.length - 1;
        while(start != end){
            int mid = start + (end - start) / 2;
            if(mountainArr[mid] > mountainArr[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }

    static int binarySearch(int[] mountainArr, int target, int start, int end){

        boolean isAsc = mountainArr[start] < mountainArr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == mountainArr[mid]){
                return mid;
            }
            if(isAsc){
                if(target > mountainArr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(target < mountainArr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
