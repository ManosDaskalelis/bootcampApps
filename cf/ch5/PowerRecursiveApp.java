package gr.aueb.cf.ch5;

import java.util.Scanner;

public class PowerRecursiveApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int power(int a, int n) {
        return (n == 0) ? 1 : a * power(a, n - 1);
    }
}
