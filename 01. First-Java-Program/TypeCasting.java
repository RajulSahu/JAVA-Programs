package com.rajul;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        float num = input.nextFloat();
//        System.out.println(num);
//
//        float num1 = 67.46f;
//        int casted = (int)(num1);
//        System.out.println(casted);

//        int a = 256;
//        byte b = (byte)(a); // 257 % 256 = 1
//        System.out.println(b);
//
//        int c = 257;
//        byte d = (byte)(c); // 257 % 256 = 1
//        System.out.println(d);

        byte e = 40;
        byte f = 50;
        byte g = 100;
        int h = (e * f) / g;

        System.out.println(h);


    }
}
