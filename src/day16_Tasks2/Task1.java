package day16_Tasks2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter number 5 numbers");
                  int countPos=0;
                   int countNeg=0;
        for (int i = 0; i <5 ; i++) {

            int num=scan.nextInt() ;
            if(i>0){
                countPos++;
            }else{
              countNeg++;
            }
        }
        System.out.println(countPos+" postive and" + countNeg +" negative");
        scan.close();
    }
}
/*
 Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */