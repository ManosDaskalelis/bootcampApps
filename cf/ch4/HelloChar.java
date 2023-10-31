package gr.aueb.cf.ch4;

/**
 * Demonstration. Declare, init chars.
 */
public class HelloChar {

    public static void main(String[] args) {
        char star = '*';
        char alpha = 'a';
        char upperAlpha = 'A';
        char dot = '.';
        char bang = '!';
        final char EMPTY_SPACE = ' ';
        int hash = '#';

        System.out.print(star);
        System.out.print(alpha);
        System.out.print(dot);

        System.out.println("Hash: " + hash);

        if (alpha > upperAlpha) {
            System.out.println("a is greater than A");
        } else {
            System.out.println("A is greater than a ");
        }
    }
}
