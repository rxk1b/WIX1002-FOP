package l3q2;

// Mahathir Imam Rakib (26068372)
import java.util.Random;

public class L3Q2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(6);
        String word;

        switch (number) {
            case 0:
                word = "zero";
                break;
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            default:
                word = "five";
        }

        System.out.println(number + " is " + word + ".");
    }
}
