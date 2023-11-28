package gr.aueb.cf.ch8;

import java.io.IOException;
import java.util.Arrays;

/**
 * Reads two chars from standard input and
 * prints to console.
 */
public class CharReadApp {

    public static void main(String[] args) {
        String s;

        try {
            s = getString();
            System.out.println(s);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static String getString() throws IOException {
        char[] tokens = new char[2];

        try {
            System.out.println("Please insert two chars");
            for (int i = 0; i < tokens.length; i++) {
                tokens[i] = (char) System.in.read();
            }
        }catch (IOException ex) {
            //recover
            ex.printStackTrace(); //log
            throw ex;    // rethrow
        }
        return Arrays.toString(tokens);
    }
}
