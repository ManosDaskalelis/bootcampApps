package gr.aueb.cf.ch7;

/**
 * Demo of Split Method.
 */
public class SplitApp {

    public static void main(String[] args) {
        String aueb = "Athens:::::::University Of Econ and Bus";

        String[] tockens = aueb.split(":+");

        for (String tocken : tockens) {
            System.out.print(tocken + " ");
        }
    }
}
