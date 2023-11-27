package gr.aueb.cf.ch7;

/**
 * Demonstrates equality between Strings.
 */
public class EqualityApp {

    public static void main(String[] args) {
        String s1 = "AUEB";
        String s2 = "AUEB";
        String s3 = "aueb";

        if (s1.equals(s2)) {
            System.out.println("Equal");
        }
        if (s1.equalsIgnoreCase(s3)) {
            System.out.println("Equal");
        }
        if (s1.compareToIgnoreCase(s3) < 0) {

        }

        String s4 = s3.toUpperCase();
        s2 = s2.toUpperCase();
        s2 = s2.toLowerCase();
        String s5 = String.valueOf(5);
//        object.toString()
    }

}
