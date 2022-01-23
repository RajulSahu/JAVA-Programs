package com.rajul;
import java.util.*;

public class SubSeqs {
    public static void main(String[] args) {
        // str = "abc"
        // ans = ["", "a", "b", "c", "ab", "ac", "bc", "abc"]
        subSeqs("", "abc");
        System.out.println();
        System.out.println(subSeqsRet("", "abc"));
    }
    static void subSeqs(String p, String up){
        if (up.isEmpty()) {
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);
        subSeqs(p+ch, up.substring(1));
        subSeqs(p, up.substring(1));
    }
    static ArrayList<String> subSeqsRet(String p, String up){
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSeqsRet(p+ch, up.substring(1));
        ArrayList<String> right = subSeqsRet(p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
