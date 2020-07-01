// Challange
// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

package Algorithms.Easy;

import java.util.Arrays;
import java.util.Random;


public class BreakingTheRecords {

    public static void main(String[] args) {
        int[] scores = new int[10];

        for (int i = 0; i < scores.length; i++) {
            Random random = new Random();
            scores[i] = random.nextInt(1000);
        }

        System.out.println("Array: " + Arrays.toString(scores));
        int[] result = breakingRecords(scores);
        System.out.println("Result of Grades: " + Arrays.toString(result));

    }

    static int[] breakingRecords(int[] scores) {
        int min = scores[0];
        int max = scores[0];
        int minResult = 0;
        int maxResult = 0;
        int[] res = new int[2];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                maxResult++;
                max = scores[i];
            } else if (scores[i] < min) {
                minResult++;
                min = scores[i];
            }
        }

        res[0] = minResult;
        res[1] = maxResult;
        return res;
    }

}
