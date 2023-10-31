package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Υπολογίζει το base ^ power.
 */
public class ForPowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;

        System.out.println("Please insert base, power");
        base = scanner.nextInt();
        power = scanner.nextInt();

        for (int i = 0; i <= power; i++) {
            result = result * base;
        }
        System.out.printf("%d^%d = %,d", base, power, result);
    }
}
