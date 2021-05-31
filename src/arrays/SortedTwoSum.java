package arrays;

/**
 * Created by Chyngyz on 2/21/2021.
 */

public class SortedTwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 6, 6, 7, 8};
        System.out.println(sortedTwoSum(arr, 4));
    }

    public static boolean sortedTwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if ((arr[left] + arr[right]) < target) {
                left++;
            } else if ((arr[left] + arr[right]) > target) {
                right--;
            } else {
                return true;
            }
        }

        return false;
    }
}
