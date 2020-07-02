// Challange
// https://www.hackerrank.com/challenges/arrays-ds/problem

package DataStructures.Easy;

import java.util.Arrays;

public class ArraysDS {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] result = reverseArray(arr);
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Reverse Array: " + Arrays.toString(result));

    }

    static int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        int index = 0;
        for (int i=arr.length-1; i>=0; i--) {
            result[index] = arr[i];
            index++;
        }
        return result;
    }

}
