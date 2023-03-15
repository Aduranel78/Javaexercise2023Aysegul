package day13_Tasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter word");
        String word=scan.next();
        scan.close();

        char first=word.charAt(0);
        int lenght =word.length();
        char second=word.charAt(lenght-1);
       char third=word.charAt(lenght-2);
        String result=" ";
        if(first==second && first==second &&first==third) {
            result = " All words are same lenght";
        } else if (second==third) {
          result = "Not Same nor Different lengths" ;

        }else {
            result=word;
        }
        System.out.println(result);
    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
 */