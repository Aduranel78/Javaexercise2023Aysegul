package day24_Tasks;

public class ReverseWord {
    public static void main(String[] args) {
            String str="Java";
            String result=reverse(str);
        System.out.println(result);



    }


    public static String reverse(String str){
         String reverse="";
        for (int  i =str.length()-1 ;i>=0; i--) {
            reverse+=str.charAt(i);


            }

        return reverse;
    }
}
/*
. create a method named reverse that passes one string parameter,
 the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ


 */