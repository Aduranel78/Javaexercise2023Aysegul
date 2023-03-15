package day15_Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int even =0;
        for (int i =0 ; i <=100; i++) {
            if(i % 2==0)
            even +=i;

        }
        System.out.println("even number = " + even);
    }
}
/*
1. Write a program that can return the sum of even numbers between 1 to 100
 */