package day24_Tasks;

public class FrequencyOfWord {

    public static void main(String[] args) {


        frequencyOfWord("Java java java python python");

    }

    public static void frequencyOfWord(String str) {
        String[] words = str.split(" ");

        int countJava = 0;


        for (String each : words) {
            if (each.equalsIgnoreCase("java")) {
                countJava++;

            }
        }
        System.out.println("Java word=" + countJava);

    }
}
/*
create a method named frequencyOfWord that passes two parameters:
string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */