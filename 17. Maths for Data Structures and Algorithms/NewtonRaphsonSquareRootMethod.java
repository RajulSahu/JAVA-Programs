package com.rajul;

public class NewtonRaphsonSquareRootMethod {
    public static void main(String[] args) {
        double n = 40;
        System.out.printf("%.3f", sqrt(n));
    }
    static double sqrt(double n){
        double x = n;
        double root;
        double allowedError = 0.5; // As you keep on decreasing the allowedError the ans will become more accurate.
        while(true) {
            root  = 0.5 * (x + (n/x));
            if (Math.abs(root - x) < allowedError){
                break;
            }
            x = root;
        }
        return root;
    }
}
