package arrays;

/**
 * Created by Chyngyz on 2/23/2021.
 */

public class NumOfOnesInSortedBitArr {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(numOnes(arr));
        System.out.println(numOnes2(arr));
    }

    public static int numOnes(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1)
                return arr.length - i;
        return -1;
    }

    public static int numOnes2(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int m;

        if (arr[l] == 1)
            return arr.length;
        if (arr[r] == 0)
            return 0;

        while (l < r) {
            m = (l + r) / 2;
            if (arr[m] > 0) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return arr.length - l;
    }
}
