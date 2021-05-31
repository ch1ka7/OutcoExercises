package numbers;

import java.util.HashMap;

/**
 * Created by Chyngyz on 2/24/2021.
 */

public class SortDigits {
    public static void main(String[] args) {
        System.out.println(sortDigits(8970));
        System.out.println(sortDigits(32445));
        System.out.println(sortDigits(10101));
        System.out.println("******************");
        System.out.println(sortDigits2(8970));
        System.out.println(sortDigits2(32445));
        System.out.println(sortDigits2(10101));
    }

    /*
    Sort Digits

    Given an integer, sort the digits in ascending order and return the new integer.
    Ignore leading zeros.

    Parameters
    Input: int
    Output: int

    Constraints
    Do not convert the integer into a string or other data type.

    Time: O(N) where N is the number of digits.
    Space: O(1)

    Examples:
    8970 --> 789
    32445 --> 23445
    10101 --> 111

    8970

     */
    public static int sortDigits(int n) {
        HashMap<Integer, Integer> digitCounts = new HashMap<>();
        int result = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            if (digitCounts.containsKey(lastDigit)) {
                    digitCounts.put(lastDigit, digitCounts.get(lastDigit) + 1);
            } else {
                digitCounts.put(lastDigit, 1);
            }
            n /= 10;
        }

        int power = 0;

        for (int i = 9; i > 0; i--) {
            if (digitCounts.containsKey(i)) {
                while (digitCounts.get(i) >= 1) {
                    result += i * Math.pow(10, power++);
                    digitCounts.put(i, digitCounts.get(i) - 1);
                }
            }
        }

        return result;
    }

    public static int sortDigits2(int n) {
        HashMap<Integer, Integer> digitCounts = new HashMap<>();
        int result = 0;

        while (n > 0) {
            int digit = n % 10;
            if (!digitCounts.containsKey(digit)) {
                digitCounts.put(digit, 1);
            } else {
                digitCounts.put(digit, digitCounts.get(digit) + 1);
            }
            n = n / 10;
        }

        int power = 0;

        for (int i = 9; i > 0; i--) {
            if (digitCounts.containsKey(i)) {
                while (digitCounts.get(i) >= 1) {
                    result += i * Math.pow(10, power);
                    power += 1;
                    digitCounts.put(i, digitCounts.get(i) - 1);
                }
            }
        }

        return result;
    }
}
