package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Demonstrates I/O with Strings
 */
public class IOApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s;   //null
        int num;

        System.out.println("Please insert a string that ends with whitespace (return/tab/spaces");
        s = in.next();
        System.out.println(s);
        num = Integer.parseInt(s);


        System.out.println("Please insert a string that ends with whitespace (return/tab/spaces");
        s = in.nextLine();
        System.out.println(s);


    }

}
