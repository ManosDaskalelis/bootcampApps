package gr.aueb.cf.ch2;

import java.math.BigInteger;
import java.lang.*;

public class AddBigIntsApp {
    public static void main(String[] args) {
        java.math.BigInteger bigNum1 = new java.math.BigInteger("213456789222");
        BigInteger bigNum2 = new BigInteger("11223131231245551232");
        BigInteger result = bigNum1.add(bigNum2);

        System.out.printf("%,d\n", result);
    }
}
