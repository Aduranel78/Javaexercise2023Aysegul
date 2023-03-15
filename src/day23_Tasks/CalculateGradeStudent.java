package day23_Tasks;

public class CalculateGradeStudent {
    public static void main(String[] args) {
        gradescore(78);
    }
    
    
    
    public static void gradescore(int score){



        String grade = "Invalid";

        if(score >=0 && score<= 100){
            grade = (score >= 90)?"A" :(score >= 80)?"B" :(score >= 70)?"C" :(score >= 60)?"D" : "E";
        }

        System.out.println("grade = " + grade);


    }
    }

/*
 create a method that can calculate the grade of the student based on the score

 */