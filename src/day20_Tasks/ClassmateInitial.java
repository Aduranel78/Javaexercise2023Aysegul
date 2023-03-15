package day20_Tasks;

public class ClassmateInitial {
    public static void main(String[] args) {
       String [] names={"Ayse Dur","Fatma dur","Hayriye Dur","Ali Dur","Ece Dur","Ela Dur","Sude Dur","Serkan Dur","Berra Dur","Gul Dur","Nur Dur"};

        for (int i = 0; i < names.length; i++) {
            String initial =names[i].charAt(0) +"."+ names[i].charAt(  names[i].indexOf(" ") + 1);
            System.out.println(initial);
        }

        }

}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */