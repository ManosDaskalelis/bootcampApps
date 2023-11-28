package gr.aueb.cf.ch3;

/**
 * Ειδηκές μορφές while.
 * 0 φορές, 1 φορά, infinite
 */
public class SpecialWhileApp {

    public static void main(String[] args) {
        int i = 1;

        while (i < 0) {
            System.out.println("Never gets in");
            i++;
        }

        while (i <= 1) {
            System.out.println("Only 1 iteration");
            i++;
        }

        while (true) {
            System.out.println("Eternal while loop");
        }
    }
}
