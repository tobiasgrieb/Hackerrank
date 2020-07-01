// Challange
// https://www.hackerrank.com/challenges/staircase/problem

package Algorithms.Easy;

public class Staircase {

    public static void main(String[] args) {
        staircase(10);

    }

    static void staircase(int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i <= n; i++) {
            stringBuilder.append(" ");
        }

        int counter = 0;
        for (int i = 1; i <= n; i++) {
            stringBuilder.replace(
                stringBuilder.length() - i,
                stringBuilder.length() - counter,
                "#");
            System.out.println(stringBuilder);
            counter++;
        }
    }

}
