package com.rajul;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CharacterClasses {
    public static void main(String[] args) {
        int count = 0;

//        String x = "[abc]";
//        String x = "[^abc]";
//        String x = "[a-z]";
//        String x = "[A-Z]";
//        String x = "[a-zA-Z]";
//        String x = "[0-9]";
//        String x = "[a-zA-Z0-9]";
        String x = "[^a-zA-Z0-9]";

        Pattern p = Pattern.compile(x);
        Matcher m = p.matcher("ab@caab23&#4c");

        while(m.find()){
            System.out.println(m.start() + "----" + m.group());
            count ++;
        }
        System.out.println("Number of occurrence: " + count);
    }
}
