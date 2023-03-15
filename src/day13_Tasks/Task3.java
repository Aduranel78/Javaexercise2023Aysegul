package day13_Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first word");
        String sent1=scan.next();
scan.close();
        char lenght1=sent1.charAt(0);
        char lenght2=sent1.charAt(sent1.length()-1);
        if(lenght1 == lenght2){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }
    }
}
/*
 write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */