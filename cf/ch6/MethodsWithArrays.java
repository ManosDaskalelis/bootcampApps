package gr.aueb.cf.ch6;

/**
 * Demo with arrays as input parameters
 * in methods
 */
public class MethodsWithArrays {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};
        printArray(arr);
        System.out.println();
        printArray(arr, 1, 3);


    }

    public static void printArray(int[] arr) {
        if (arr == null) return;

        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    /**
     * Overloaded version of printArray. Prints
     * the elements of an array in a region defined
     * form low to high.
     * @param arr   the array .
     * @param low    low index.
     * @param high   high index.
     */
    public static void printArray(int[] arr, int low, int high) {
        if (arr == null) return;
        if (low < 0 || high > arr.length - 1)  return;

        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
