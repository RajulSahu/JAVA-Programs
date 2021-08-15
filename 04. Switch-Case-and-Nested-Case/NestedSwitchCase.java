package com.rajul;
import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Employee ID: ");
        int empID = sc.nextInt();
        System.out.println();
        System.out.print("Enter Department name: ");
        String department = sc.next();

        switch(empID){
            case 1:
                System.out.println("Rajul Sahu");
                break;
            case 2:
                System.out.println("Kunal Kushwaha");
                break;
            case 3:
                System.out.println("Emp number 3:");
                switch(department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department found!");
                }
                break;
            default:
                System.out.println("No Employee ID found!");
        }
    }
}
