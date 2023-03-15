package day13_Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter  first sentence");
        String sent1=scan.nextLine();
        System.out.println("Please enter second sentence");
        String sent2 =scan.nextLine();
         int length1=sent1.length();
         int lenght2=sent1.length();
         if(length1> lenght2){
             System.out.println(sent1);
         }else {
             System.out.println(sent2);
         }




    }
}
/*
write a program that asks user to enter two strings,

 and print out the longest string

 */