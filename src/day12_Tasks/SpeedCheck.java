package day12_Tasks;

import java.util.Scanner;

public class SpeedCheck {
    public static void main(String[] args) {
        int speed= 55;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter current speed: ");
        int currentSpeed = input.nextInt();
        input.close();
        int overlimit=currentSpeed - speed ;

        if (overlimit > 0) {
            System.out.println("You're driving " + overlimit +" over the limit Slow down!");
        }


    }
}
/*
 Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
 */