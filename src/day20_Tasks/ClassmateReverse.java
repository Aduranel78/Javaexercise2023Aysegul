package day20_Tasks;

public class ClassmateReverse {
    public static void main(String[] args) {
        String[] arr = {"Ayse", "Fatma", " Ali","Ece","Nur","ELa","Elif","Gul","Ala","Sena"};

        for (int i = 0; i < arr.length; i++) {
            String name = arr[i];
            String reverseName = "";
            for (int j = name.length()-1; j >= 0; j--) {
                reverseName += name.charAt(j);
            }

            System.out.println(reverseName);
                
            }
        }
        }

/*
 create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */