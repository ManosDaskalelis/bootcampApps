package gr.aueb.cf.ch6;

public class Predicates {

    public static void main(String[] args) {

    }

    /**
     * Checks if all the elements in an array are even.
     *
     * @param arr       the source array.
     * @return          the boolean result.
     */
    public static boolean allAreEvens(int[] arr) {
        if (arr == null) return false;
        boolean isEven = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                isEven = false;
                break;
            }
        }
        return isEven;
    }

    /**
     * Checks if an array has at least 1 even number.
     * @param arr           the source array.
     * @return              the boolean result.
     */
    public static boolean anyIsEven(int[] arr) {
        if (arr == null) return false;
        boolean isEven = false;
        for (int num : arr) {
            if (num % 2 == 0) {
                isEven = true;
                break;
            }
        }
        return isEven;
    }
}
