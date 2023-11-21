package gr.aueb.cf.ch6;

/**
 * Mapping Demo.
 */
public class Mapping {

    public static void main(String[] args) {
        int[] wages = {500, 200, 500, 100, 100, 2000};
        final double BONUS = 500.10;
        double[] bonusWages = getWagesWithBonus(wages, BONUS);

        for (double salary : bonusWages) {
            System.out.print(salary + " ");
        }

    }

    /**
     * Returns the updated -with bonus, wages.
     *
     * @param wages         the initial wages.
     * @param bonus         the provided bonus.
     * @return              a new array with the updated wages.
     */
    public static double[] getWagesWithBonus(int[] wages, double bonus) {
        if (wages == null) return null;
        double[] wagesOut = new double[wages.length];

        for (int i = 0; i < wagesOut.length; i++) {
            wagesOut[i] = wages[i] + bonus;
        }

        return wagesOut;
    }
}
