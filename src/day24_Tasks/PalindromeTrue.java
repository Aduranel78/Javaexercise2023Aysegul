package day24_Tasks;

public class PalindromeTrue {

    public static void main(String[] args) {
            String str="level";

            String result=polindromeWord(str);

            System.out.println(result);

            if(str.equalsIgnoreCase(result)){
            System.out.println("it is true");
        }else {
            System.out.println("it is not true");
        }
    }
    public static String polindromeWord(String str){

            String reverse ="";
            for (int i = str.length()-1; i >= 0 ; i--) {
                reverse += str.charAt(i);
            }
        return reverse;
    }
}



/*
4. By using the reverse method above to create another method named isPalindrome  that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false

				Ex:
					str = "Level"

					isPalindrome(str) ===> true

 */