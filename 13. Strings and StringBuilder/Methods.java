package com.rajul;

import java.lang.reflect.Array;
import java.util.*;

public class Methods {
    public static void main(String[] args) {
        String name = "Rajul Sahu";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println("   Rajul Sahu   ".trim());
        System.out.println("   Rajul Sahu   ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
