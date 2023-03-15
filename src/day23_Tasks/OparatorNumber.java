package day23_Tasks;

public class OparatorNumber {
    public static void main(String[] args) {
        calculate(10.0, 20.0, '*');
    }

    public static void calculate(double num1, double num2, char operator) {

        String result = "Invalid";

        if (operator == '-' || operator == '+' || operator == '*' || operator == '/') {

            if (operator == '-') {
                result = "Subtraction: " + (num1 - num2);
            } else if (operator == '+') {
                result = "Addition: " + (num1 - num2);
            } else if (operator == '*') {
                result = "Multiplication: " + (num1 * num2);
            } else {
                result = "Division: " + (num1 / num2);
            }

        }

        System.out.println(result);

    }
}
/*
14. create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result

/*
 write a program to ask user to enter two number and math operator, and return the result.

if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */