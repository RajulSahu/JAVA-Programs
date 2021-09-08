package com.rajul;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharacterClasses {
    public static void main(String[] args) {
        int count = 0;
        String x = "\\s";
//        String x = "\\S";
//        String x = "\\d";
//        String x = "\\D";
//        String x = "\\w";
//        String x = "\\W";
//        String x = ".";

        Pattern p = Pattern.compile(x);
        Matcher m = p.matcher("ab@caab 23&#4c");

        while(m.find()){
            System.out.println(m.start() + "-----" + m.group());
            count ++;
        }
        System.out.println("Number of occurrence: " + count);
    }
}
