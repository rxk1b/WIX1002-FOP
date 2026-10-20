package l2q2;

import java.util.Scanner;

// WIX1002 - Lab 2, Question 2: Monthly car-loan payment.
public class L2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the car: ");
        double price = input.nextDouble();
        System.out.print("Enter the down payment: ");
        double downPayment = input.nextDouble();
        System.out.print("Enter the annual interest rate (%): ");
        double rate = input.nextDouble();
        System.out.print("Enter the loan duration in years: ");
        int years = input.nextInt();

        double monthlyPayment = (price - downPayment)
                * (1 + rate * years / 100.0) / (years * 12.0);

        System.out.printf("Monthly payment: %.2f%n", monthlyPayment);
    }
}
