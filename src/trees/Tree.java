package trees;

/**
 * Created by Chyngyz on 2/25/2021.
 */

public class Tree {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x + " " + y);

    }
}
