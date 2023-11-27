package gr.aueb.cf.ch7;

/**
 * Compares String vs String Builder.
 */
public class StringBuilderApp {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        String s = "";
        long timeStart = 0;
        long timeEnd = 0;
        double stringElapseTime =0.0;
        double sbElapseTime = 0.0;

        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 30_000; i++){
            s = s + i;
        }
        timeEnd = System.currentTimeMillis();
        stringElapseTime = (timeEnd - timeStart) / 1000.0;


        timeStart = System.currentTimeMillis();
        for (int i = 1; i <= 30_000; i++){
            sb.append(i);
        }
        timeEnd = System.currentTimeMillis();
        sbElapseTime = (timeEnd - timeStart) / 1000.0;

        System.out.println("String elapse time : " + stringElapseTime + " seconds ");
        System.out.println("String Builder elapse time : " + sbElapseTime + " seconds ");
    }
}
