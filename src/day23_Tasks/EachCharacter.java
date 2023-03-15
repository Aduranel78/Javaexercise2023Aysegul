package day23_Tasks;

public class EachCharacter {
    public static void main(String[] args) {
        eachCharacter("aysegul");
    }
    public static void eachCharacter(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }


}

/*
create a method named printEachChar
 that can print each characters of a string
 */