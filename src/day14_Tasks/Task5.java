package day14_Tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("please enter a word");
        String word=scan.next();
        scan.close();
      char str=word.charAt(0);
        String result=" ";

        if( str >= 0 && str <= 9){
            System.out.println("First character is digit");

        } else if (str >= 'a' && str  <= 'z') {
            result="first character is lowerCase letter";
        } else if (str>='A'&& str <='Z') {
            result="first character is uppercase letter";
        }else {
            result="first character is special character";
        }
        System.out.println(result);
    }


}
/*
 Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"

 */