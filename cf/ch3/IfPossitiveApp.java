package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ελέγχει αν ένας ακέραιος είναι
 * θετικός (>=0)
 */
public class IfPossitiveApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please insert an int");
        num = scanner.nextInt();

        if (num >= 0) {
            System.out.println("Possitive");
        } else {
            System.out.println("Negative");
        }
     }
}
