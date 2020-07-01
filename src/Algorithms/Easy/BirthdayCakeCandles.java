// Challange
// https://www.hackerrank.com/challenges/birthday-cake-candles/problem

package Algorithms.Easy;

import java.util.Arrays;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        int[] ar = {3, 2, 1, 3, 1};

        System.out.println(birthdayCakeCandles(ar));
    }

    static int birthdayCakeCandles(int ar[]) {
        int max = Arrays.stream(ar).max().getAsInt();
        int counter = 0;

        for (int number : ar) {
            if (number == max) {
                counter ++;
            }
        }
        return counter;
    }
}
