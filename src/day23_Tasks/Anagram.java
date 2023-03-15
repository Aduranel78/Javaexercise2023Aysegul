package day23_Tasks;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        anagram("silent","listen");


    }


    public static void anagram(String str1,String str2){

        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

    if(Arrays.equals(char1,char2)){
        System.out.println("silent and listen are anagram");
    }else {
        System.out.println("silent and listen are not anagram");
    }

    }
}
/*

       create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */