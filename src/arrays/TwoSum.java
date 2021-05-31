package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Chyngyz on 2/22/2021.
 */

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {4, 2, 6, 5, 7, 9, 10};
        System.out.println(twoSum(arr, 4));
        System.out.println(twoSum2(arr, 4));

        System.out.println(Arrays.toString(twoSums(arr, 13)));
    }

    public static boolean twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean twoSum2(int[] arr, int target) {
        Set<Integer> set = new HashSet<>();

        for (int i : arr) {
            if (set.contains(target - i)) {
                return true;
            }
            set.add(i);
        }

        return false;
    }

    public static int[] twoSums(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i]))
                return new int[]{map.get(target - arr[i]), i};
            map.put(arr[i], i);
        }

        return null;
    }
}
