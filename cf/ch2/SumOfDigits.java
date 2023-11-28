package gr.aueb.cf.ch2;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int firstDigit = 0;
        int secondDigit = 0;
        int total = 0;
        int sumOfSquares = 0;
        System.out.println("Please insert a two digit int");
        num = scanner.nextInt();
        firstDigit = num / 10;
        secondDigit = num % 10;
        total = firstDigit + secondDigit;
        System.out.printf("The result is %d", total);

        sumOfSquares = (int) Math.pow(firstDigit, 2) + (int) Math.pow(secondDigit, 2);
        System.out.println("The sum of squares is : " + sumOfSquares);


    }
}
