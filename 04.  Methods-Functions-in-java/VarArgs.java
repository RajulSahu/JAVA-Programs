package com.rajul;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        multiple(9, 10, "Rajul", "Sahu");
    }

    static void multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
