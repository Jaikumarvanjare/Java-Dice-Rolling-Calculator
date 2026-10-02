import java.util.Random;
import java.util.Scanner;

public class DiceRolling {

    static void printDice(int num) {
        switch (num) {
            case 1:
                System.out.println(
                    "+-------+\n" +
                    "|       |\n" +
                    "|   *   |\n" +
                    "|       |\n" +
                    "+-------+"
                );
                break;

            case 2:
                System.out.println(
                    "+-------+\n" +
                    "| *     |\n" +
                    "|       |\n" +
                    "|     * |\n" +
                    "+-------+"
                );
                break;

            case 3:
                System.out.println(
                    "+-------+\n" +
                    "| *     |\n" +
                    "|   *   |\n" +
                    "|     * |\n" +
                    "+-------+"
                );
                break;

            case 4:
                System.out.println(
                    "+-------+\n" +
                    "| *   * |\n" +
                    "|       |\n" +
                    "| *   * |\n" +
                    "+-------+"
                );
                break;

            case 5:
                System.out.println(
                    "+-------+\n" +
                    "| *   * |\n" +
                    "|   *   |\n" +
                    "| *   * |\n" +
                    "+-------+"
                );
                break;

            case 6:
                System.out.println(
                    "+-------+\n" +
                    "| *   * |\n" +
                    "| *   * |\n" +
                    "| *   * |\n" +
                    "+-------+"
                );
                break;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of dice: ");
        int dice = sc.nextInt();

        System.out.println("\nRolling " + dice + " dice...\n");

        int total = 0;

        for (int i = 1; i <= dice; i++) {
            int roll = random.nextInt(6) + 1;
            total += roll;

            System.out.println("Dice " + i + ": " + roll);
            printDice(roll);
            System.out.println();
        }

        System.out.println("Total: " + total);

        sc.close();
    }
}