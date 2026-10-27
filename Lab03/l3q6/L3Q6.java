package l3q6;

// Mahathir Imam Rakib (26068372)
import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter x: ");
        double x = scanner.nextDouble();
        System.out.print("Enter y: ");
        double y = scanner.nextDouble();

        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            return;
        }

        // Include points on the circumference as inside the circle.
        double distanceSquared = x * x + y * y;
        if (distanceSquared <= radius * radius) {
            System.out.println("The point is inside the circle.");
        } else {
            System.out.println("The point is outside the circle.");
        }
    }
}
