package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class Calculator {

    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String DIVIDE = "/";
    private static final String MULTIPLY = "*";

    public static void main(String[] args) {

        /**
         *
         * Write a calculator program
         * if there is an invalid operator return result as -1
         *
         * Example output:
         *  Enter your first number:
         *  1
         *   Enter your operator:
         *  /
         *  Enter your second number:
         *  0
         *  Your result is Infinity
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        double number1 = sc.nextDouble();
        System.out.print("Enter your operator: ");
        String operator = sc.next();
        System.out.print("Enter your second number: ");
        double number2 = sc.nextDouble();
        double result = 0;

        //TODO implement your code here...
        if (operator.equals(PLUS) || operator.equals(MINUS) || operator.equals(MULTIPLY) || operator.equals(DIVIDE)) {
            if (operator.equals(PLUS)) {
                System.out.println(number1 + number2);
            }

            if (number1 > number2 && operator.equals(MINUS)) {
                System.out.println(number1 - number2);
            } else if (number2 > number1 && operator.equals(PLUS)) {
                System.out.print(number2 + number1);
            }

            if (operator.equals(MULTIPLY)) {
                System.out.println(number1 * number2);
            }

            if (operator.equals(DIVIDE)) {
                System.out.println(number1 / number2);
            }
        }else{
            System.out.println("You entered something wrong");
        }


        //ignore this...
        Validation.testCalculator(number1, operator, number2, result);
    }
}
