package gr.aueb.cf.ch4;

public class FactorialApp {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Factorial of " + n + " is: " + facto(n));
    }

    /**
     * returns the factorial.
     *
     * @param n the input number.
     * @return the factorial of n.
     */
    public static int facto(int n){
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= 1;
        }
        return factorial;
    }
}
