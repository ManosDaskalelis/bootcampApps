package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει μια θερμοκρασία και ένα boolean
 * για το αν βρέχει, από το stdin και
 * αποφασίζει αν χιονίζει.
 */
public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Please insert temp");
        temperature = scanner.nextInt();
        System.out.println("Please insert if its raining (true / false)");
        isRaining = scanner.nextBoolean();

        isSnowing = isRaining && (temperature < 0 ); //short-circuit

        System.out.println("Is snowing: " + isSnowing);
    }
}
