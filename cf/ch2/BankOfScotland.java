package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από το stdin ενα ακέραιο που
 * αναπαριστά λίρες Σκώτιας, τις μετατρέπει
 * σε δολάρια και λεπτά usd ($1 = 100cents)
 * και εκτυπώνει το αποτέλεσμα ως εξης, για
 * παράδειγμα: 10 λίρες Σκωτίας = χχ δολάρια
 * usd και yy cents.
 */
public class BankOfScotland {

    public static void main(String[] args) {
        int scottishPounds = 0;
        int usdDollars = 0;
        int usdCents = 0;
        int totalUsdCents = 0;
        final int PARITY = 137;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please insert the amount of Scottish pounds");
        scottishPounds = scanner.nextInt();
        totalUsdCents = scottishPounds * PARITY;
        usdDollars = totalUsdCents / 100;
        usdCents = totalUsdCents % 100;

        System.out.printf("\u00A3%d (Scottish Pounds) = \u0024%d (USD Dollars) and %d USD Cents",
                scottishPounds, usdDollars, usdCents);
    }
}
