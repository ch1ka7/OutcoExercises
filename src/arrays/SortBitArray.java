package arrays;

import java.util.Arrays;

/**
 * Created by Chyngyz on 2/22/2021.
 */

public class SortBitArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 1, 1, 0};
        System.out.println(Arrays.toString(sort(arr)));
        System.out.println(Arrays.toString(sort2(arr)));
    }

    public static int[] sort(int[] arr) {
        int index = 0;
        int zeros = 0;

        for (int i : arr)
            if (arr[i] == 0)
                zeros++;

        while (index < arr.length)
            if (index < zeros)
                arr[index++] = 0;
            else
                arr[index++] = 1;

        return arr;
    }

    public static int[] sort2(int[] arr) {
        int j = 0;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 1) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return arr;
    }

}
