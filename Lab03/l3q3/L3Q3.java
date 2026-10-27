package l3q3;

// Mahathir Imam Rakib (26068372)
import java.util.Scanner;

public class L3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the sales volume: ");
        double sales = scanner.nextDouble();

        if (sales < 0) {
            System.out.println("Sales volume cannot be negative.");
            return;
        }

        double rate;
        if (sales <= 100) {
            rate = 0.05;
        } else if (sales <= 500) {
            rate = 0.075;
        } else if (sales <= 1000) {
            rate = 0.10;
        } else {
            rate = 0.125;
        }

        double commission = sales * rate;
        System.out.printf("Total commission: RM %.2f%n", commission);
    }
}
