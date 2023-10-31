package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει ένα star στην πρώτη γραμμή
 * δύο στην δεύτερη γραμμή κλπ.
 */
public class StarsAscending {

    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
