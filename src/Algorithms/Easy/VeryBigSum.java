// Challange
// https://www.hackerrank.com/challenges/a-very-big-sum/problem

package Algorithms.Easy;

public class VeryBigSum {
    public static void main(String[] args) {
        long[] arr = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};

        long res = aVeryBigSum(arr);
        System.out.println("Sum: " + res);
    }

    static long aVeryBigSum(long[] ar) {
        long result = 0;
        for (long counter : ar) {
            result += counter;
        }
        return result;
    }
}
