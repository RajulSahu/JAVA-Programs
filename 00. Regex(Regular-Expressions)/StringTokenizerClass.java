package com.rajul;

import java.util.StringTokenizer;

public class StringTokenizerClass {
    public static void main(String[] args) {
        StringTokenizer s1 = new StringTokenizer("Rajul Sahu MCA");
        StringTokenizer s2 = new StringTokenizer("20-03-1997", "-");
        while(s2.hasMoreTokens()){
            System.out.println(s2.nextToken());
        }
    }
}
