package arrays;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Chyngyz on 2/23/2021.
 */

public class MissingNumbers {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 2};
        int[] arr2 = {4, 7, 1, 6};
        int[] arr3 = {6, 4, 2, 1};

        System.out.println(missingNumber(4, arr1));
        System.out.println(missingNumber(8, arr2));
        System.out.println(missingNumber(6, arr3));
    }

    public static ArrayList<Integer> missingNumber(int n, int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr)
            set.add(i);

        for (int i = 1; i <= n; i++)
            if (!set.contains(i))
                list.add(i);

        return list;
    }
}
