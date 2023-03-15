package day13_Tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Username");
        String word=scan.next();

        System.out.println("Password");
        String word2=scan.next();

        scan.close();

        if(word.equals("Cydeo") && word2.equals("WoodenSpoon")){
            System.out.println("Logged In");
        }else{
            System.err.println("Incorrect username or password");
        }





    }
    }

/*
You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
 */