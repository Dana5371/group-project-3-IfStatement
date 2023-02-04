package main.java.devxschool.student;

import main.java.devxschool.test.Validation;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        /**
         *
         * Write Java program to allow the user to input weather and temperature outside.
         * Then the program will show if person needs to take umbrella, coat, sunglasses, or combination of items.
         * Umbrella to take if weather is snowy or rainy and temperature is more than 50 inclusively,
         * Sunglasses to take if it's sunny and temperature more is than 50 inclusively
         * If it's colder than 50 Fahrenheit, and the weather is either snowy or rainy, person will take both umbrella and coat
         * Person will take only coat if its sunny, but temperature less than 50
         *
         *
         * example output:snowy or rainy
         * Enter weather outside(rainy, snowy, sunny):
         * sunny
         * Enter temperature outside:
         * 60
         *
         * Please take sunglasses, thanks
         *
         * example output:
         *
         * Enter weather outside(rainy, snowy, sunny):
         * snowy
         * Enter temperature outside:
         * 40
         *
         * Please take umbrella and coat, thanks!
         *
         */


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weather outside(rainy, snowy, sunny): ");
        String weather = sc.next();
        System.out.print("Enter temperature outside: ");
        double temperature = sc.nextDouble();
        String thingsToTake = "";


        //TODO implement your code here...
        if (weather.toLowerCase().equals("snowy") || weather.toLowerCase().equals("rainy") && temperature >= 50){
            System.out.println("Please take umbrella, thanks!");
        }else if (weather.toLowerCase().equals("sunny") && temperature >= 50 ){
            System.out.println("Please take sunglasses, thanks!");
        }else if (weather.toLowerCase().equals("snowy") || weather.toLowerCase().equals("rainy") && temperature < 50){
            System.out.println("Please take umbrella and coat, thanks!");
        }else if (weather.toLowerCase().equals("sunny") && temperature < 50){
            System.out.println("Please take coat, thanks!");
        }






        //ignore this...
        Validation.testWeather(temperature, weather, thingsToTake);
    }
}
