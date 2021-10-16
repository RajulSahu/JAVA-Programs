package com.rajul;


public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] character = {'e','e','e','e','e','e','n','n','n','n'};
        char target = 'e';
        char ans = nextGreatestLetter1(character, target);
        System.out.println(ans);
    }
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (letters[start] > target || letters[end] <= target) return letters[start];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (letters[mid] == target) {
                if (letters[mid+1] != target) return letters[mid+1];
                else start = mid + 1;
            }
            else if (letters[mid] > target){
                if (letters[mid - 1] <= target){
                    return letters[mid];
                }
                end = mid - 1;
            }
            else{
                if (letters[mid + 1] > target){
                    return letters[mid+1];
                }
                start = mid + 1;
            }
        }
        return letters[0];
    }
    static char nextGreatestLetter1(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }

        return letters[start % letters.length];
    }
}
