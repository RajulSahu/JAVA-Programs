package com.rajul;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "abcdcba";
        boolean ans = checkPalindrome(str);
        System.out.println((ans) ? "Palindrome":"Not Palindrome");
    }
    static boolean checkPalindrome(String str){
        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while (start <= end){
            if (str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
