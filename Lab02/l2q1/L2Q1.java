package l2q1;

import java.util.Scanner;

// WIX1002 - Lab 2, Question 1: Fahrenheit to Celsius.
public class L2Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = (fahrenheit - 32) / 1.8;
        System.out.printf("Temperature in Celsius: %.2f%n", celsius);
    }
}
