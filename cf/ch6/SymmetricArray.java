package gr.aueb.cf.ch6;

public class SymmetricArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 1};
        System.out.println("Array is symmetric: " + isSymmertic(arr));
    }

    public static boolean isSymmertic(int[] arr) {
        boolean isSymmetric = true;

   /*     for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                isSymmetric = false;
                break;
            }
        }*/

        int n = arr.length;
        for (int i = 0; i < n / 2; i ++) {
            if (arr[i] != arr[n - 1]) {
                isSymmetric = false;
                break;
            }
        }

        return isSymmetric;
    }
}
