package numbers;

/**
 * Created by Chyngyz on 2/23/2021.
 */

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(4, 2));
        System.out.println(gcd(2, 4));
    }

    public static int gcd(int n1, int n2) {
        if (n2 == 0)
            return n1;
        return gcd(n2, n1 % n2);
    }
}
