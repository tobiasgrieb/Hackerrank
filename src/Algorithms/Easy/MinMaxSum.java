// Challange
// https://www.hackerrank.com/challenges/mini-max-sum/problem

package Algorithms.Easy;

import java.util.Arrays;


public class MinMaxSum {

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 7};

        miniMaxSum(arr);
    }

    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        long min = 0;
        long max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            min += arr[i];
        }
        for (int i = arr.length - 1; i > 0; i--) {
            max += arr[i];
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
