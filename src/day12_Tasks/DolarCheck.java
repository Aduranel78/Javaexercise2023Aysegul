package day12_Tasks;

import java.util.Scanner;

public class DolarCheck {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter cents");
        int cents=input.nextInt();
        input.close();
        int dollar  = cents / 100;
        System.out.println(dollar+" dollars and "+cents+" cents");
    }
}
/*

3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */