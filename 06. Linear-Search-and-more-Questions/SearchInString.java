package com.rajul;

public class SearchInString {
    public static void main(String[] args) {
        String S = "Rajul Sahu";
        char target = 'u';
        boolean ans = search(S, target);
        System.out.println(ans);
    }

    static boolean search(String str, char target){
        if(str.length() ==0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == target){
                return true;
            }
        }
        return false;
    }
}
