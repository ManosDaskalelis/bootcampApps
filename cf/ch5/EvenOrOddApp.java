package gr.aueb.cf.ch5;

import java.util.Scanner;

public class EvenOrOddApp {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;

        System.out.println("Please insert a number to check if its even or odd");
        num1 = scanner.nextInt();

        if (isEven(num1)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


    }

    /**
     * Evaluates if the int is even.
     *
     * @param a the int.
     * @return
     */
    public static boolean isEven(int a) {
        return (a % 2) == 0;

    }

    /**
     * Evaluates if the int is odd.
     *
     * @param a the int.
     * @return
     */
    public static boolean isOdd(int a) {
        return (a % 2) == 1;
    }
}
