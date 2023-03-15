package day21_Tasks;

import java.util.Arrays;

public class EvenAndOldNumberArray {
    public static void main(String[] args) {
// aysegul
//serkan
        int[] num = {4, 50, 66, 77, 54, 87, 60, 10, 25, 85, 500, 53, 1, 10};

        int odd = 0;
        int evens = 0;
        int[] n1 = new int[num.length];

        for (int each : num) {

            if (each % 2 == 0) {
                evens++;
            } else {
                odd++;

            }
        }
        System.out.println(Arrays.toString(num) + " has " + evens+ " even numbers and " + odd+ " odd numbers");

    }
}
/*
 Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop
 */