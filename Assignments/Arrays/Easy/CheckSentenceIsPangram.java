package com.rajul;


public class CheckSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(sentence);
        System.out.println(ans);
    }
    static boolean checkIfPangram(String sentence){
        for (int i = 97; i <= 122; i++) {
            if(sentence.indexOf((char)(i)) == -1){
                return false;
            }
        }
        return true;
    }
}
