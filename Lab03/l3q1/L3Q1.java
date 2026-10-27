package l3q1;

// Mahathir Imam Rakib (26068372)
import java.util.Scanner;

public class L3Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        int result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = num1 / num2;
                break;
            case '%':
                if (num2 == 0) {
                    System.out.println("Cannot calculate a remainder with zero.");
                    return;
                }
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }

        System.out.printf("%d %c %d = %d%n", num1, operator, num2, result);
    }
}
