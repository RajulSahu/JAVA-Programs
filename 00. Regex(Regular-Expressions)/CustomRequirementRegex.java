package com.rajul;

public class CustomRequirementRegex {
    public static void main(String[] args) {
        //Q: Write a regex to represent all yava(custom language) identifiers:
             // Rules:
             // Rule 1: Allowed characters are a-z, A-Z, 0-9, #, $.
             // Rule 2: The length of identifier should be at-least 2.
             // Rule 3: The first character of the identifier should be a lower case alphabet from a-k.
             // Rule 4: The second character should be a digit divisible by 3(0,3,6,9).

        String exp = "[a-k][0369][a-zA-Z0-9#$]*";
        //Sample TestCases:
        String i1 = "e3ndl"; // Valid
        String i2 = "h2elloWorld"; // Invalid
        String i3 = "f9lower"; // Valid
        String i4 = "u0pper()"; // Invalid
        if(i4.matches(exp)){
            System.out.println("Valid Identifier");
        }
        else{
            System.out.println("Invalid Identifier");
        }

    }
}
