package strings;

/**
 * Created by Chyngyz on 2/24/2021.
 */

public class CharacterMode {
    public static void main(String[] args) {
        System.out.println(characterMode("A walk in the park"));
    }

/*
Character Mode

Input: String
Output: String

Constraints:
- if more than one letter is the most frequent, return all of them
- uppercase should be counted as lowercase
- don't include spaces

Time: O(N)
Space: O(N)

Examples:
"hello" -> "l"
"A walk in the park" -> "a"
"noon" -> "no"

    [h, e, l, l, o]

     a  b  c  d  e  f  g ...
    [0, 0, 0, 0, 1, 0, 0 ...]

- create int arr
- loop through the each character of the input string
    - fill in the each index with the count of each character

- loop through the charCounts array
    - find the max
- return

 */

    public static String characterMode(String str) {
        int[] chars = new int[26];
        int maxFrequency = 0;
        String result = "";

        for (char c : str.replaceAll("\\s+", "").toLowerCase().toCharArray())
            chars[c - 97]++;

        for (int i : chars)
            if (i > maxFrequency)
                maxFrequency = i;

        for (int i = 0; i < chars.length; i++)
            if (chars[i] == maxFrequency)
                result += (char) (i + 97);

        return result;
    }
}
