package l2q5;

import java.util.Random;

// WIX1002 - Lab 2, Question 5: Sum the digits of a random number.
public class L2Q5 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10001); // 0 to 10000, inclusive.

        int digitSum = number / 10000
                + (number / 1000) % 10
                + (number / 100) % 10
                + (number / 10) % 10
                + number % 10;

        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + digitSum);
    }
}
