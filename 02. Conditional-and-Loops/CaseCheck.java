package com.rajul;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character to check whether it is upper-case or lower-case: ");
        char ch = sc.next().trim().charAt(0);
//        System.out.println((int)(ch));
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("LOWER-CASE");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("UPPER-CASE");
        }
        else{
            System.out.println("Please enter a valid character!");
        }
    }
}
