package gr.aueb.cf.ch4;

public class FloatingPointApp {

    public static void main(String[] args) {
        float floatNum = 2F;
        double doubleNum = 5.5d;
        int num = 23;
        double result = 0.0;

        result= doubleNum % floatNum;

        System.out.printf("%.2f + %.2f + %d = %.2g", floatNum, doubleNum, num, result);


    }
}
