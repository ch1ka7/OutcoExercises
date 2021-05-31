package arrays;

import java.util.Arrays;

/**
 * Created by Chyngyz on 2/21/2021.
 */

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(merge2SortedArrays2(arr1, arr2)));
    }

    public static int[] merge2SortedArrays(int[] firstArr, int[] secondArr) {
        int first = 0;
        int second = 0;
        int index = 0;

        int firstArrLength = firstArr.length;
        int secondArrLength = secondArr.length;

        int[] mergedArr = new int[firstArrLength + secondArrLength];

        while (first < firstArrLength && second < secondArrLength) {
            mergedArr[index++] = firstArr[first] < secondArr[second] ? firstArr[first++] : secondArr[second++];
        }

        while (first < firstArrLength)
            mergedArr[index++] = firstArr[first++];

        while (second < secondArrLength)
            mergedArr[index++] = secondArr[second++];

        return mergedArr;
    }

    public static int[] merge2SortedArrays2(int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;

        for (int k = 0; k < mergedArr.length; k++) {
            if (j >= arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                mergedArr[k] = arr1[i++];
            } else {
                mergedArr[k] = arr2[j++];
            }
        }

        return mergedArr;
    }
}
