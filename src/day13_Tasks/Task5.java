package day13_Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first word:");
        String word1 = scan.next();

        System.out.println("Enter your second word");
        String word2 = scan.next();

        System.out.println("Enter your third word");
        String word3 = scan.next();

        scan.close();

        String result = "";

        if ( word1.length() == word2.length() && word2.length() ==word3.length() ){
            result = "All words are same length";
        }else if(word1.length() == word2.length()){
            result =  "Not Same nor Different lengths";
        }else if(word1.length() == word3.length() ){
            result =  "Not Same nor Different lengths";
        }else if(word2.length() == word3.length()) {
            result =  "Not Same nor Different lengths";
        } else {
            result = "All different length";
        }

        System.out.println(result);


    }

}


/*
 Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
 */