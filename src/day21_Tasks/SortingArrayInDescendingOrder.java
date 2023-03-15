package day21_Tasks;

import java.util.Arrays;

public class SortingArrayInDescendingOrder {
    public static void main(String[] args) {
            int[] number={1,2,3,4,5,6};

            int [] reversed =new int[number.length];

        for (int i =number.length-1, j= 0; i >=0;i-- , j++) {
            reversed[j]=number[i];
        }
        System.out.println(Arrays.toString(reversed));
        }
    }

/*
 Write a program that sort the array of integer in descending order
 */