package com.rajul;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check: ");
        int year = sc.nextInt();
        System.out.println((leapYear(year)) ? "Leap Year" : "Not a Leap Year");
    }
    static boolean leapYear(int year){
        if(year>999 && year<=9999)
            if(year % 100 == 0){
               if (year % 400 == 0) return true;
               return false;
            }
            else{
                if (year % 4 == 0) return true;
                else return false;
            }
        else{
            return false;
        }
    }
}
