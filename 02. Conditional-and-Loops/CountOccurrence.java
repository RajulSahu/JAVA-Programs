package com.rajul;
import java.util.Scanner;

public class CountOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check in: ");
        int n = sc.nextInt();
        System.out.println();
        System.out.print("Enter the target number to count its occurrence: ");
        int target = sc.nextInt();
        int count = 0;
        int num = n;

        while(n!=0){
            int rem = n % 10;
            if(rem == target){
                count ++;
            }
            n = n / 10;
        }

        System.out.printf("The %d occurred %d times in %d", target, count, num);
    }
}
