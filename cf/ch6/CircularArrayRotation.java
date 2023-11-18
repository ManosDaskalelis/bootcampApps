package gr.aueb.cf.ch6;

public class CircularArrayRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 1, 2};

        shiftLeftBy(arr, 2);
        for (int el : arr) {
            System.out.print(el + " ");
        }
    }

    public static int[] shiftRightBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + offset) % arr.length] = arr[i];
        }

        return rotated;
    }

    public static int[] shiftLeftBy(int[] arr, int offset) {
        if (arr == null) return null;
        if (offset < 0) return null;
        int[] rotated = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[i] = arr[(i + offset) % arr.length];
        }

        return rotated;
    }
}
