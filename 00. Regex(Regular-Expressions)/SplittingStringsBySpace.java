package com.rajul;
import java.util.regex.Pattern;

public class SplittingStringsBySpace {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\s");
        String s = "Rajul Sahu MCA";
        String [] str = p.split(s);

        for(String value: str){
            System.out.println(value);
        }
    }
}
