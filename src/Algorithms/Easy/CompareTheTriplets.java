// Challange
// https://www.hackerrank.com/challenges/compare-the-triplets/problem

package Algorithms.Easy;

import java.util.ArrayList;
import java.util.List;


public class CompareTheTriplets {
    public static final int SIZE = 3;

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        a.add(0, 3);
        a.add(0, 2);
        a.add(0, 1);

        b.add(0, 1);
        b.add(0, 2);
        b.add(0, 3);

        List<Integer> result = compareTriplets(a, b);

        System.out.println(result);
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<Integer>();
        int aliceScore = 0;
        int bobScore = 0;

        for (int i = 0; i < SIZE; i++) {
            if (a.get(i) > b.get(i)) {
                aliceScore++;
            } else if (a.get(i) < b.get(i)) {
                bobScore++;
            }
        }
        result.add(0, aliceScore);
        result.add(1, bobScore);
        return result;

    }

}

