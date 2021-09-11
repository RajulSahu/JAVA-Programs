package com.rajul;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);

        System.out.println("a" + 1); // Here integer will be converted into Integer wrapper class.
        // Which is same as "a" + "1" = a1

        System.out.println("Rajul" + new ArrayList<>());
        System.out.println("rajul" + new Integer(56));
    }
}
