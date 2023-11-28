package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού μέχρι ο χρήστης να επιλέξει
 * quit / exit.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choise = 0;

        do {
            System.out.println("Επίλεξτε ένα από τα παρακάτω:");
            System.out.println("1. Εισαγωγή Μαθήτη");
            System.out.println("2. Διαγραφή Μαθήτη");
            System.out.println("3. Έξοδος");
            choise = scanner.nextInt();
        } while (choise != 3);
    }
}
