package com.rajul;

public class CountZeros {
    public static void main(String[] args) {
        int n = 1002300400;
        int zeros = countZeros(n);
        System.out.println(zeros);
    }
    static int countZeros(int n){
        return count(n , 0);
    }
    static int count(int n, int c){
        if(n == 0){
            return c;
        }
        if(n%10 == 0){
            return count(n/10, c+1);
        }
        return count(n/10, c);
    }
}
