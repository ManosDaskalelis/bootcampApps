package gr.aueb.cf.ch2;

/**
 * Προσομοιώνουμε δυο ζάρια
 */
public class RandomDiceApp {
    public static void main(String[] args) {
        int die1 = (int)(Math.random() * 6) + 1; // * (max - min + 1) + min
        int die2 = (int)(Math.random() * 6) + 1; // * (max - min + 1) + min

        System.out.println("Die1L " + die1 + ", Die2: " + die2);
    }
}
