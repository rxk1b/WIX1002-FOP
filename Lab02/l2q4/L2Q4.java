package l2q4;

import java.util.Scanner;

// WIX1002 - Lab 2, Question 4: Seconds to hours, minutes and seconds.
public class L2Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        long totalSeconds = input.nextLong();

        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;

        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds%n",
                totalSeconds, hours, minutes, seconds);
    }
}
