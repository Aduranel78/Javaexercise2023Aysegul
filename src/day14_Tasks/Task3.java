package day14_Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter code");
        String code =scan.next();
        String s1=code.substring( 1);
        System.out.println(s1);
    }
}
/*
3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code

 */