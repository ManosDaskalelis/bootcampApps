package gr.aueb.cf.ch6;

/**
 * Reducing Demo.
 */
public class Reducing {

    public static void main(String[] args) {

    }

    /**
     * Returns the sum of all the elements.
     *
     * @param arr       the source array.
     * @return          the aggregate total.
     */
    public static int getTotal(int[] arr) {
        if (arr == null) return 0;
        int total = 0;
        for (int item : arr) {
            total += item;
        }
         return total;
    }

    /**
     * Returns the average
     * @param arr
     * @return
     */
    public static double getAvg(int[] arr) {
        if (arr == null) return 0.0;
        if (arr.length == 0) return 0.0;

        return getTotal(arr) / (double) arr.length;

    }
}
