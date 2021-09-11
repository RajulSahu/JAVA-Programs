package com.rajul;

public class Comparison {
    public static void main(String[] args) {
        String a = "Rajul";
        String b = "Rajul";
        // Both Strings a and b will be stored inside a string pool which is inside a heap sharing a common memory space,
        // both variables will point to a single string stored in string pool.
        System.out.println((a==b));

        // But if you create different objects as shown below as-
        String c = new String("Sahu");
        String d = new String("Sahu");
        // both of the above strings contains same content, but they are created separately
        // as string objects, and they will be stored separately in the heap memory and not in the string pool.
        System.out.println(c==d);

        // So to check two different string objects we can use String.equals() even if they are created separately.
        System.out.println(a.equals(b));
        System.out.println(c.equals(d));
    }

}
