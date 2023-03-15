package day15_Tasks;

public class Task8 {
    public static void main(String[] args) {
        String str="Anna";
             String result="";
        for (int i=str.length()-1;i>=0; i--) {
            result += str.charAt(i);

        } boolean palindrome=str.equalsIgnoreCase(result);
            System.out.println(palindrome);
        }
    }

