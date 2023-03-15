package day15_Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int odd=0;
        for (int i=0; i <= 100; i++) {
            if (i % 2!=0)
            odd += i;
        }
        System.out.println("odd = " + odd);;
    }
}
/*
 Write a program that can return the sum of odd numbers between 1 to 100
 */