// Challange
// https://www.hackerrank.com/challenges/plus-minus/problem

package Algorithms.Easy;

public class PlusMinus {

    public static void main(String[] args) {
        int[] arr = {-4, 3, -9, 0, 4, 1};

        plusMinus(arr);
    }

    static void plusMinus(int[] arr) {
        double positive = 0.0;
        double negative = 0.0;
        double zero = 0.0;

        for (int counter : arr) {
            if (counter > 0) {
                positive += 1;
            } else if (counter < 0) {
                negative += 1;
            } else {
                zero += 1;
            }
        }
        System.out.printf(
            "%.5f\n%.5f\n%.5f\n",
            (positive/arr.length),
            (negative/arr.length),
            (zero/arr.length));

    }
}
