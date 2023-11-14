package gr.aueb.cf.ch6;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {9, 4, 8, 12, 3, 23, 2};
        int min;
        int minPosition;
        int tmp;

        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            minPosition = i;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }

            tmp = arr[i];
            arr[i] = arr[minPosition];
            arr[minPosition] = tmp;
        }

    }
}
