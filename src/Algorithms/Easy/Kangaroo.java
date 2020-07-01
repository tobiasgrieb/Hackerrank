// Challange
// https://www.hackerrank.com/challenges/kangaroo/problem

package Algorithms.Easy;

public class Kangaroo {

    public static void main(String[] args) {
        String res = kangaroo(10, 2, 3, 3);
        System.out.println(res);

    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        for( int i = 0; i <10_000; i++) {
            if (x1 == x2) {
                System.out.println("Meet at point: " + x1);
                return "YES";
            } else {
                x1 += v1;
                x2 += v2;
            }
        }
        return "NO";
    }
}
