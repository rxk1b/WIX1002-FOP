package l3hw1;

// Mahathir Imam Rakib (26068372)
// Extra lab task: Valid Boomerang (LeetCode 1037).
import java.util.Scanner;

public class L3HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] points = new int[3][2];

        for (int i = 0; i < points.length; i++) {
            System.out.print("Enter x and y for point " + (i + 1) + ": ");
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
        }

        long dx1 = (long) points[1][0] - points[0][0];
        long dy1 = (long) points[1][1] - points[0][1];
        long dx2 = (long) points[2][0] - points[0][0];
        long dy2 = (long) points[2][1] - points[0][1];

        // Equal products mean collinear points or repeated points.
        boolean boomerang = dx1 * dy2 != dy1 * dx2;
        System.out.println(boomerang);
    }
}
