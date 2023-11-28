package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζεται εξακολουθητικά ένα μενού στον χρήστη με επιλογές
 * μέχρι να δώσει 3 (Quit).
 *
 */
public class Menu1App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.println("Επιλέξτε ένα από τα παρακάτω");
            System.out.println("1. One player game");
            System.out.println("2. Two player game");
            System.out.println("3. Quit");
            System.out.println("Δώστε Επιλογή");

            choice = scanner.nextInt();

            if (choice <= 0 || choice >= 4) {
                System.out.println("Λάθος Επιλογή");
                continue;
            }

            if (choice == 1){
                System.out.println("Οne Player Game Starting");
            }else {
                System.out.println("Two Player Game Starting");
            }
        }
    }
}
