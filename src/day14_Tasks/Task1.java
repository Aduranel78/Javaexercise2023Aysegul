package day14_Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please print word");
          String firstWord=scan.next();
        System.out.println("Please enter second word");
        String secondWord=scan.next();
        scan.close();

        String result=firstWord.substring(1)+secondWord.substring(1);
        System.out.println(result);

    }
}
/*
      Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana

 */