package gr.aueb.cf.ch6;

public class ArrayCopy {

    public static void main(String[] args) {
        int[] arr = {2, 2};
        int[] clone = shallowCopy(arr);
        int[] arr2 = deepCopy(arr);
        clone[0] = 500;

        for (int el : arr) {
            System.out.print(el + " ");
        }

        System.out.println();
        for (int el : arr2) {
            System.out.print(el + " ");
        }
    }

    public static int[] shallowCopy(int[] arr) {
        return arr;
    }

    public static int[] deepCopy(int[] arr) {
        int[] arrayToReturn = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrayToReturn[i] = arr[i];
        }
        return arrayToReturn;
    }
}
