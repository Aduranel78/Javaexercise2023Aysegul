package day14_Tasks;

public class Tekrar {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        String email="mike_tyson@gmail.com";
        String lastName = email.substring(email.indexOf("_")+1 , email.indexOf("@"));
        System.out.println(lastName);
    }
}
