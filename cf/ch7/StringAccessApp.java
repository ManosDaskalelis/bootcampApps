package gr.aueb.cf.ch7;

/**
 * Traverse a string and prints char by char.
 */
public class StringAccessApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        System.out.println();

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));

        }
        System.out.println();
    }
}
