package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει αρχική τιμή, τελικη τιμη,
 * και βημα αυξησης (step) και υπολογιζει τον αριθμο τον
 * επαναληψεων (iterations).
 *
 */
public class GenericWhileApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        int endValue = 0;
        int step = 0;
        int iterations;
        int j = 1;

        while (j <=3) {
            System.out.println("Please insert beginValue, endValue, and step");
            start = scanner.nextInt();
            endValue = scanner.nextInt();
            step = scanner.nextInt();
            iterations = 0;

            while (start <= endValue) {
                start += step;
                iterations++;
            }
        System.out.println("Iterations: " + iterations);
            j++;
        }
    }
}
