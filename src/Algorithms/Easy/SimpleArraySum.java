// Challange
// https://www.hackerrank.com/challenges/simple-array-sum/problem

package Algorithms.Easy;


public class SimpleArraySum {

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};

        int result = simpleArraySum(ar);
        System.out.println("Sum of items in array: " + result);

    }

    static int simpleArraySum(int[] ar) {
        int result = 0;
        for (int counter : ar) {
            result += counter;
        }
        return result;
    }
}
