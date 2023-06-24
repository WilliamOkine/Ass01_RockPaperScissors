import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain;

        do {
            System.out.println("Player A, choose rock, paper, or scissors: ");
            String A = getStringInput(scan);

            System.out.println("Player B, choose rock, paper, or scissors: ");
            String B = getStringInput(scan);

            System.out.println("Player A chose: " + A);
            System.out.println("Player B chose: " + B);

            // Determine the winner
            String result = determineWinner(A, B);
            System.out.println(result);

            System.out.println("Play again? [Y/N]");
            playAgain = scan.next();
            scan.nextLine(); // Consume the newline character

        } while (playAgain.equalsIgnoreCase("Y"));
    }

    public static String getStringInput(Scanner scan) {
        String input;
        while (true) {
            input = scan.nextLine().toUpperCase();
            if (input.equals("R") || input.equals("P") || input.equals("S")) {
                return input;
            } else {
                System.out.println("Invalid input. Please choose R, P, or S.");
            }
        }
    }

    public static String determineWinner(String A, String B) {
        if (A.equals(B)) {
            return "It's a tie!";
        } else if ((A.equals("R") && B.equals("S")) || (A.equals("P") && B.equals("R"))
                || (A.equals("S") && B.equals("P"))) {
            return "Player A wins!";
        } else {
            return "Player B wins!";
        }
    }
}


