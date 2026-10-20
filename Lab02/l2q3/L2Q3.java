package l2q3;

import java.util.Random;

// WIX1002 - Lab 2, Question 3: Three random integers from 10 to 50.
public class L2Q3 {
    public static void main(String[] args) {
        Random random = new Random();

        // nextInt(41) gives 0 to 40; adding 10 gives 10 to 50.
        int first = random.nextInt(41) + 10;
        int second = random.nextInt(41) + 10;
        int third = random.nextInt(41) + 10;

        int sum = first + second + third;
        double average = sum / 3.0;

        System.out.printf("Numbers: %.2f %.2f %.2f%n",
                (double) first, (double) second, (double) third);
        System.out.printf("Sum: %.2f%n", (double) sum);
        System.out.printf("Average: %.2f%n", average);
    }
}
