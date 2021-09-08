package com.rajul;

import java.util.regex.Pattern;

public class SplittingStringsByDot {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("."); // Will not get any output as "." is for all character.
//        Pattern p = Pattern.compile("\."); // will get error because "\." is not a valid escape sequence.
        Pattern p = Pattern.compile("\\."); //will give the correct output.

        String s = "www.google.com";
        String [] str = p.split(s);

        for(String value: str){
            System.out.println(value);
        }
    }
}
