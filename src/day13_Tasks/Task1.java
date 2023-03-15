package day13_Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scan.nextLine();
scan.close();
        char first=sentence.charAt(0);
        int length=sentence.length();

        char last=sentence.charAt(length-1);

        System.out.println("first character= " + first);
        System.out.println("last character = " + last);

    }
}
/*
 write a program that asks user to enter a sentence.
 then print the first & last characters of the sentence
 */