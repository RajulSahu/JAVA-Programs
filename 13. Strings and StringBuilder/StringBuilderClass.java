package com.rajul;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch).append(" ");
        }
        System.out.println(builder);
    }
}
