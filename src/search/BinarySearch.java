package search;

/**
 * Created by Chyngyz on 2/22/2021.
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7, 8, 10, 11, 13, 15, 17, 20, 22};
        System.out.println(binarySearch(arr, 17));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        while (start < end) {
            mid = (start + end) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                end = mid;
            else
                start = mid;
        }

        return -1;
    }
}
