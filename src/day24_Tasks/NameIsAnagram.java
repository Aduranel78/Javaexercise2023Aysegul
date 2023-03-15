package day24_Tasks;

import java.util.Arrays;

public class NameIsAnagram {
    public static void main(String[] args) {
             nameIsAnagram("cba","bac");
    }

    public static void nameIsAnagram(String str1,String str2){
       char[] char1=str1.toCharArray();
        char[] char2=str2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);
        boolean cheq= Arrays.equals (char1,char2);

        System.out.println("Anagram is="+cheq);
    }
}
/*
create a method named isAnagram that passes two String parameters, the method returns true if the given two strings are anagram, otherwise returns false
    			Ex:
    				str1 = "cba"
    				str2 = "bac";

    				isAnagram(str1, str2) ====> true
 */