package gr.aueb.cf.ch9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class PrintStreamMethod {

    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream("C:/tmp/f1.txt", "Windows-1252");
            PrintStream ps2 = new PrintStream("C:/tmp/f2.txt", StandardCharsets.UTF_8);
            PrintWriter pw = new PrintWriter("C:/tmp/f3.txt")) {
            printMsg(ps,"Hello Again!!!");
            printMsg(ps2,"Hello Again!!!");
            printMsg(System.out, "Hello to std output!!!");
            pw.println("Hello Coding Factory");
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    public static void  printMsg(PrintStream ps, String message) {

        ps.println(message);
    }
}
