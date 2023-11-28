package gr.aueb.cf.ch3;

import java.util.Scanner;

public class IfAbsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int abs = 0;

        System.out.println("Please insert a num");
        num1 = scanner.nextInt();

        // Ternary Operator - Τριαδικός τελεστής
        abs = (num1 > 0) ? num1 : -num1;

        System.out.println("The result is: " + num1);
    }
}
