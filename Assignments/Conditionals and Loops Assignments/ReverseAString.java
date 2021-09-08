package com.rajul;
import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to reverse: ");
        String s = sc.nextLine();
        String reversed = reverse(s);
        System.out.println(reversed);

    }
    static String reverse(String s){
        String reversed = "";
        for (int i = s.length()-1; i >= 0; i--) {
            reversed = reversed + s.charAt(i);
        }
        return reversed;
    }
}
