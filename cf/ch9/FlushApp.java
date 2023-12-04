package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Flushes the contents of pring stream.
 */
public class FlushApp {

    public static void main(String[] args) {
          try (PrintWriter pw = new PrintWriter("C:/tmp/f2.txt")) {
              Scanner in = new Scanner(System.in);
              pw.print("Hello coding factory");
              pw.flush();
              System.out.println("Please insert");
              in.nextLine();
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("File not found");
        }
    }
}
