package day23_Tasks;

public class ConvertDollarToLira {
    public static void main(String[] args) {
        convertLira(10);
    }




    public static void convertLira(double dollarAmount){
        double Turklira= dollarAmount * 19.85;
        System.out.println(dollarAmount+"dollar equal to" + Turklira+" Turklira");
    }
}
