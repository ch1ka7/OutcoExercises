package strings;

/**
 * Created by Chyngyz on 2/23/2021.
 */

public class RGB {
    public static void main(String[] args) {
        String input = "rgbrgbbgr";
        System.out.println(rgb(input));
    }

    public static int rgb(String str) {
        int r = 0;
        int g = 0;
        int b = 0;

        for (char c : str.toCharArray()) {
            if (c == 'r')
                r++;
            if (c == 'g')
                g++;
            if (c == 'b')
                b++;
        }
        return Math.min(Math.min(r, g), Math.min(g,b));
    }
}
