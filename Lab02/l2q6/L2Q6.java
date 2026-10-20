package l2q6;

import java.util.Scanner;

// WIX1002 - Lab 2, Question 6: Energy needed to heat water.
public class L2Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Follow the sample's input units: grams and Fahrenheit.
        System.out.print("Enter the amount of water in grams: ");
        double grams = input.nextDouble();
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialFahrenheit = input.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalFahrenheit = input.nextDouble();

        // The formula requires kilograms and Celsius.
        double kilograms = grams / 1000.0;
        double initialCelsius = (initialFahrenheit - 32) / 1.8;
        double finalCelsius = (finalFahrenheit - 32) / 1.8;
        double energy = kilograms * (finalCelsius - initialCelsius) * 4184;

        System.out.printf("The energy needed is %.6e joules%n", energy);
    }
}
