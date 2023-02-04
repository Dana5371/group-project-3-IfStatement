package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class NumberIdentifier {
    public static void main(String[] args) {

        /**
         *
         * Write a Java program that reads an integer and check whether it is negative, zero, or positive.
         *
         * example output:
         * Enter a number
         * 0
         * Your number "0" is zero
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String value = "";

        //TODO implement your code here...
        if (number < 0){
            System.out.println("negative");
        }else if (number > 0){
            System.out.println("positive");
        }else if (number == 0){
            System.out.println("zero");
        }











        /*ignore this...*/
        Validation.testNumber(number, value);

        System.out.println("\n\n#########################################\nTask2\n\n");
        /**
         *
         * Take three numbers from the user and print the greatest number.
         * if numbers are equal then print all equal numbers.
         *
         * example output:
         * Enter first number:
         * 1
         * Enter second number:
         * 1
         * Enter third number:
         * 1
         * The greatest number: 1 & 2 & 3
         *
         *
         *
         * Enter first number:
         * 100
         * Enter second number:
         * 50
         * Enter third number:
         * 200
         * The greatest number: 3
         *
         */


        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        String greatestNum = "";


        //TODO implement your code here...


        System.out.println("The greatest number: " + greatestNum);


        //ignore this...
        Validation.testGreatestNumber(num1, num2, num3, greatestNum);

    }
}
