package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *Αποφασίζει αν θα ανάψει τα φώτα η όχι
 * με βάση 1) _αν βρέχει_, 2) _αν είναι σκοτεινά_,
 * και 3) αν η _ταχύτητα_ είναι > 100χιλ.
 * Τις τίμες τις δίνει ο χρήστης από το stdin
 */
public class LightsOnApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRaining = false;
        boolean isDark = false;
        int speed = 0;
        final int MAX_SPEED = 100;
        boolean isRunning = false;
        boolean lightsOn = false;

        System.out.println("Please insert if is it raining (true / false)");
        isRaining = scanner.nextBoolean();

        System.out.println("Please insert if is it dark");
        isDark = scanner.nextBoolean();

        System.out.println("Please insert car speed");
        speed = scanner.nextInt();

        //lightsOn = isRaining && (isDark || (speed > MAX_SPEED));     //short-circuit
        lightsOn = isRaining && (isDark || isRunning);     //short-circuit

        System.out.println("Lights on: " + lightsOn);
    }
}
