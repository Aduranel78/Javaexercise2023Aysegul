package day23_Tasks;

public class pirintedOddnumbers {
    public static void main(String[] args) {

        printoddNumber();
    }

    public static void printoddNumber() {


        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }



}





/*
1. create a method that can print odd numbers between 1~100 in a same line saperated by space
 */