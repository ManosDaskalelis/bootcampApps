package gr.aueb.cf.ch4;

public class Addapp {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int result = 0;

        result = add(a, b);

        System.out.printf("%d + %d = %d", a, b, result);
    }

    /**
     * Returns the sum of two integers
     * @param a first int
     * @param b second int
     * @return the sum
     */
    public static int add(int a, int b) {
        //Δήλωση και αρχικοποίηση
        int sum = 0;

        //Εντόλες
        sum = a + b;


        return sum;
    }
}
