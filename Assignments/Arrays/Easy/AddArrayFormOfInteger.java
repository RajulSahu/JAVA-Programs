package com.rajul;
import java.math.BigInteger;
import java.util.*;


public class AddArrayFormOfInteger {
    public static void main(String[] args) {
        int[] num = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        List<Integer> ans = addToArrayForm(num, k);
        System.out.println(ans);
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        String n = "";
        for (int i : num) {
            n += i + "";
        }
        BigInteger n_BI = new BigInteger(n);
        BigInteger k_BI = new BigInteger(k+"");
        BigInteger sum = n_BI.add(k_BI);
        n = sum.toString();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n.length(); i++) {
            result.add(Character.getNumericValue(n.charAt(i)));
        }
        return result;
    }
}
