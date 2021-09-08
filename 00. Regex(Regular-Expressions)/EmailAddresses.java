package com.rajul;

public class EmailAddresses {
    public static void main(String[] args) {
        String email1 = "sahur5426@gmail.com";
        String email2 = "smtptestmail@yahoo.co.in";
        String email3 = "01testmail@GMAIL.com";
        String email4 = "Rajul3242@gmail.co.in.ap";
        String email5 = "_rajul3223@gmail.com";

        // Regex Expression for only Gmail IDs:
        String gmail_exp = "[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com";
        // Regex Expression for any mail IDs:
        String exp = "[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+";
        if(email1.matches(exp)){
            System.out.println("Email is valid.");
        }
        else{
            System.out.println("Email is not valid.");
        }
    }
}
