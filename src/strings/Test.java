package strings;

import java.util.Arrays;

/**
 * Created by Chyngyz on 2/22/2021.
 */

public class Test {
    public static void main(String[] args) {

    }

    public static String letterSort(String string) {
        int[] chars = new int[26];
        Arrays.fill(chars, 0);
        String result = "";
        int charIndex;

        for (char c : string.toLowerCase().toCharArray()) {
            charIndex = c - 97;
            chars[charIndex]++;
        }

        for (int i = 0; i < chars.length; i++) {
            while (chars[i] > 0) {
                char letter = (char) +(i + 97);
                result += letter;
                chars[i]--;
            }
        }

        return result;
    }
}
