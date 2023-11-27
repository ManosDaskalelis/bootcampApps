package gr.aueb.cf.ch8;

import java.util.Scanner;

public class ArithmeticExceptionApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = 0;
        int denumarator = 0;
        int result = 0;

        System.out.println("Please insert two ints");
        numerator = in.nextInt();
        denumarator = in.nextInt();

        result = numerator / denumarator;

        System.out.println("Result " + result);
    }
}
