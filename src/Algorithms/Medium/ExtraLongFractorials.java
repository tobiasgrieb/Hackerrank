// Challange
// https://www.hackerrank.com/challenges/extra-long-factorials/problem

package Algorithms.Medium;

import java.math.BigInteger;

public class ExtraLongFractorials {

    public static void main(String[] args) {
        extraLongFactorials(3);
        extraLongFactorials(4);
        extraLongFactorials(25);
    }

    static void extraLongFactorials(int n) {
        BigInteger factorial = new BigInteger("1");
        for (int i = n; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
