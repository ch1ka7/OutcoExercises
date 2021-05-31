package matrices;

/**
 * Created by Chyngyz on 3/1/2021.
 */

public class RobotPaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }
    public static int uniquePaths(int m, int n) {
        return traverse(0, 0, new int[m][n]);
    }

    public static int traverse(int x, int y, int[][] matrix) {
        // base cases
        if (x < 0 || y < 0 || x >= matrix[0].length || y >= matrix.length) {
            return 0;
        } else if (matrix[y][x] == 1) {
            return 0;
        } else if (x == matrix[0].length - 1 && y == matrix.length - 1) {
            return 1;
        }

        matrix[y][x] = 1;
        int count = 0;
        count += traverse(x + 1, y, matrix);
        count += traverse(x - 1, y, matrix);
        count += traverse(x, y + 1, matrix);
        count += traverse(x, y - 1, matrix);
        matrix[y][x] = 0;

        return count;
    }
}
