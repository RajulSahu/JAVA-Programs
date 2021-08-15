package com.rajul;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condition = true;


        while(condition){
            System.out.print("Choose operation +, -, *, /, %: ");
            char op = sc.next().trim().charAt(0);
            System.out.println();
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter first number: ");
                int a = sc.nextInt();
                System.out.println();
                System.out.print("Enter second number: ");
                int b = sc.nextInt();

                if (op == '+'){
                    System.out.println("Ans is: "+ (a+b));
                }
                else if(op == '-'){
                    System.out.println("Ans is: "+ (a-b));
                }
                else if(op == '*'){
                    System.out.println("Ans is: "+ (a*b));
                }
                else if(op == '/'){
                    System.out.println("Ans is: "+ (a/b));
                }
                else{
                    System.out.println("Ans is: "+ (a%b));
                }
            }
            else if(op == 'x' || op == 'X'){
                condition = false;
            }
            else{
                System.out.println("Provide correct input!");
            }
        }
    }
}
