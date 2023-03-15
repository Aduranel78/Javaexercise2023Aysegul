package day23_Tasks;

public class ConvertDolarToEuro {
    public static void main(String[] args) {
           convertDolarEuro(225.5);
    }




    public static void convertDolarEuro(double dollarAmount){
        double euro   = dollarAmount * 1.6   ;

        System.out.println(dollarAmount+"dollar equal to "+euro+" euro");
    }

}
/*
 create a method that can convert dollar to euro
 */