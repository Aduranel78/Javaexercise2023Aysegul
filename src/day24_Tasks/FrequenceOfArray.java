
package day24_Tasks;

import java.util.Arrays;

public class FrequenceOfArray {
    public static void main(String[] args) {

        int[] array = {1, 1, 1, 1, 1, 2, 2};


        for (int j = 0; j < array.length; j++) {
            int ch = array[j]; //'A'
            int frequency = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == ch) {
                    frequency++;
                }

            }

            if (frequency == 1) {
                System.out.println(ch);
            }
        }
    }
}
/*

             create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

 */