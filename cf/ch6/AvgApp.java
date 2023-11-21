package gr.aueb.cf.ch6;

public class AvgApp {

    public static void main(String[] args) {
        int[] array = {5, 5, 5, 5, 5};
        double num = averageOfArray(array);
        System.out.println(num);

    }

   public static double averageOfArray(int[] array) {
        if (array == null) return 0.0;
        if (array.length == 0) return 0.0;
        int total = 0;
        int length = array.length;
        for (int num : array) {
            total += num;
        }
        double average = (double) total / length;

        return average;
   }
}
