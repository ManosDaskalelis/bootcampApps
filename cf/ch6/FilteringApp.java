package gr.aueb.cf.ch6;

public class FilteringApp {

    public static void main(String[] args) {
        int[] arr = new int[] {5, 5, 4, 6, 2, 9, 10};
        final int PASS = 5;

        int[] passed = getPassGrades(arr, PASS);
        for (int grade : passed) {
            System.out.print(grade + " ");
        }

    }

    /**
     * Returns a new array that contains the
     * pass grades of the source array.
     *
     * @param grades        the source array.
     * @param limit         the threshold that
     *                      the pass grades are compared to.
     * @return              a new array with the pass grades.
     */
    public static int[] getPassGrades(int[] grades, int limit) {
        int count = 0;
        if (grades == null) return null;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= limit) {
                count++;
            }
        }
        int[] passOut = new int[count];
        int pivot = -1;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= limit) {
//                pivot++;
                passOut[++pivot] = grades[i];
            }
        }

        return passOut;
    }
}
