package l3q5a;

// Mahathir Imam Rakib (26068372)
// Alternate Cramer's rule program using decimal input, an array and a loop.
import java.util.Scanner;

public class L3Q5a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] coefficients = new double[6];

        for (int i = 0; i < coefficients.length; i++) {
            System.out.printf("Enter %c: ", (char) ('a' + i));
            coefficients[i] = scanner.nextDouble();
        }

        double a = coefficients[0];
        double b = coefficients[1];
        double c = coefficients[2];
        double d = coefficients[3];
        double e = coefficients[4];
        double f = coefficients[5];
        double denominator = a * d - b * c;

        // A negative denominator is valid; only zero prevents division.
        if (denominator == 0) {
            System.out.println("The equation has no solution");
        } else {
            double x = (e * d - b * f) / denominator;
            double y = (a * f - e * c) / denominator;
            System.out.printf("x = %.2f%ny = %.2f%n", x, y);
        }
    }
}
