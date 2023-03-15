package day15_Tasks;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number");
        int number=scan.nextInt();
        if(number<0){
            System.out.println("Invalid number");
        }else {
        int sum=0;
        for (int i = 0; i <=number ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}}
/*
 write a program that can calculate the sum of all numbers between 1 to any given number
                ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */