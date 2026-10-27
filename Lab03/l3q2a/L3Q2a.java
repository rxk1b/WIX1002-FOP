package l3q2a;

// Mahathir Imam Rakib (26068372)
// Alternate number-to-word program using an array.
import java.util.Random;

public class L3Q2a {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(6);
        String[] words = {"zero", "one", "two", "three", "four", "five"};

        System.out.println(number + " is " + words[number] + ".");
    }
}
