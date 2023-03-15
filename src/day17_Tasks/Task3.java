package day17_Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter e number");
            int num1 = scan.nextInt();

            System.out.println("Enter a second number");
            int num2 = scan.nextInt();

            System.out.println("Enter a valid Operator");
            char ch = scan.next().charAt(0);

            int total = 0;
            while (!(ch == '+' || ch == '-' || ch == '/' || ch == '*')) {
                System.err.println("Invalid operator,Please re enter");
                ch = scan.next().charAt(0);
            }
            double result = 0;

            if (ch == '+') {
                result = num1 + num2;
            } else if (ch == '-') {
                result = num2 - num1;

            } else if (ch == '*') {
                result = num2 * num1;

            } else {
                result = num1 / num1;
            }
                System.out.println(result);
                System.out.println("Would you like to select another room?");
                String a = scan.nextLine().toLowerCase();

                while (!(a.equals("yes") || a.equals("no"))) { // while the answer is not valid answer
                    System.out.println("Invalid Entry, please re-enter");
                    System.out.println("Would you like to select another room?");
                    a = scan.nextLine().toLowerCase();
                } // it stops if the answer is either ye or no

                if (a.equals("no")) {
                    System.out.println("Thanks for using Cydeo calculator!");
                    break;
                }


            }

            scan.close();


        }
    }
/*
 write a program to ask user to enter two number and math operator,
 and return the result.

		if the operator is invalid operator,
		ask user to re-enter the operator until user provides a valid operator (+, -, *, /)

 */