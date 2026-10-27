package l3q4;

// Mahathir Imam Rakib (26068372)
import java.util.Random;

public class L3Q4 {
    public static void main(String[] args) {
        Random random = new Random();

        int player1Roll1 = random.nextInt(6) + 1;
        int player1Roll2 = random.nextInt(6) + 1;
        int player2Roll1 = random.nextInt(6) + 1;
        int player2Roll2 = random.nextInt(6) + 1;
        int player1Score = player1Roll1 + player1Roll2;
        int player2Score = player2Roll1 + player2Roll2;

        System.out.printf("Player 1 rolls: %d and %d. Total: %d%n",
                player1Roll1, player1Roll2, player1Score);
        System.out.printf("Player 2 rolls: %d and %d. Total: %d%n",
                player2Roll1, player2Roll2, player2Score);

        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It is a tie!");
        }
    }
}
