package day13_Tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter first word");
        String word1=scan.next();
        System.out.println("Please enter second word");
        String word2=scan.next();


        char f=word1.charAt(0);
        char l=word2.charAt(0);
        String txt =f +" ." +l;

        String initials = f+". " +l +". ";
        System.out.println(initials);
        System.out.println(txt.toUpperCase());
    }
}
/*
 write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */
