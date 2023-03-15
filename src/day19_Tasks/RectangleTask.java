package day19_Tasks;

import java.util.Scanner;

public class RectangleTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Enter length of rectangle:");
             float length = scan.nextFloat();

             System.out.println("Enter width of rectangle:");
            float width = scan.nextFloat();

            if (length<= 0 && width <=0) {
                System.err.println("Invalid Entry for the radius of the rectangle");
                System.exit(0);
            }


            double area = (length * width);
            double perimeter = 2 * (length + width);


            System.out.println("area of rectangle = " + area);
            System.out.println("perimeter of rectangle = " + perimeter);

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while( !(a.equals("yes") || a.equals("no")) ){
                System.err.println("Invalid Entry, please re-enter! Would you like to continue?");
                a = scan.next().toLowerCase();
            }

            if(a.equals("no")){
                System.out.println("Thank you for using Cydeo rectangle calculator app!");
                break;
            }

        }


        scan.close();

    }
}
/*
 Write a program that can calculate the area and perimeter of a Rectangle:
			1. Ask the user "Enter the length of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

			2. Ask the user "Enter the width of the Rectangle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

			3. Display:
					1. Area of rectangle
					2. Perimeter of rectangle

			4. Ask the user "Would you like to calculate another Rectangle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */