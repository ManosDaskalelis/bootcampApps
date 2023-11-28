package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Division2App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert the numerator");
            numerator = scanner.nextInt();

            System.out.println("Please insert the denominator");
            denominator = scanner.nextInt();

            if (denominator == 0) {
                System.out.println("Denominator cannot be zero");
                break;
            }

            if (numerator == 0 ) {
                System.out.println("Numerator cannot be zero");
                break;
            }

            result = numerator / denominator;

            System.out.println("Result: " + result);
        }
    }
}
