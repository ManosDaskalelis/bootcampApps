package gr.aueb.cf.ch6;

public class GradesDistributionApp {

    public static void main(String[] args) {
        int[] grades = {30, 9, 8, 14, 22, 17, 49, 55, 100, 99, 12, 55, 66, 32, 55};
        int[] distribution = new int[10];

        for (int grade : grades) {
            if (grade == 100) distribution[9] += 1;
            else distribution[grade / 10] += 1;
        }

        for (int i = 0; i < distribution.length; i++) {
            System.out.printf("%02d-%02d", i * 10, (i != 9) ? (i * 10 + 9) : (i * 10 + 10));
            for (int j = 1; j <= distribution[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
