package day11_tasks;

public class CappuccinoBuyer {
    public static void main(String[] args) {
      /*
        Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can display the price and calories of cappuccino
        Valid sizes are tall, grande, venti and their price & calories are:

        tall:
        price is $3.69
        90 calories

        grande:
        price is $3.99;
        120 calories

        venti:
        price is $4.29
        150 calories

        If the size is invalid then the output should be "Invalid Size"


        Note:
        Solution 1: use if statement
        Solution 2: use switch statement
        Solution 2: use if & switch statements mixed


       */
        double price1 = 3.99;
        double price2= 3.69;
        double price3 = 4.29;
         String collection="tall";
        boolean validname = collection == "grande" || collection == "venti"|| collection == "tall" ;
        if (validname) {
            switch (collection) {
                case "tall" :
                    System.out.println(price1 + " TALL + 90 calories");
                    break;
                case "grande":
                    System.out.println(price2 +" Grande + 120 calories");
                    break;
                default:
                    System.out.println(price3 + " Vande + 150 calories");
            }
        } else{
                System.out.println("invalid size");
            }

        }
    }

