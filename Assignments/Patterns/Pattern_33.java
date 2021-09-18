package com.rajul;

//         a
//         B c
//         D e F
//         g H i J
//         k L m N o

public class Pattern_33 {
   public static void main(String[] args) {
      pattern33(5);
   }
   static void pattern33(int n){
      int character = 65;
      int count = 0;
      for (int row = 0; row < n; row++) {
         for (int col = 0; col <= row; col++) {
            if (count%2 == 0) System.out.print((char)(character + count + 32) + " ");
            else System.out.print((char)(character + count) + " ");
            count++;
         }
         System.out.println();
      }
   }
}
