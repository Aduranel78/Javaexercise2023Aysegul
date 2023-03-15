package day23_Tasks;

public class EligibleAlcohol {
    public static void main(String[] args) {
        eligibleage(22);
    }


    public static void eligibleage(int age){

        if(age>=18){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Not Eligible to buy alcohol");
        }
    }
}
/*
3. create a method that can check if a person is eligible to buy alcohol
 */