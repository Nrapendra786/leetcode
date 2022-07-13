package mypack.robot_in_grid;

public class RobotInGrid {

    public static void main(String[] args) {
        int row = 7, col = 3;
        int[][] grid = new int[row][col];
        System.out.println(uniquePath(row, col));
    }

    private static int uniquePath(int row, int col) {
        int[] dp = new int[col];
        int count[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            count[i][0] = 1;
        }

        for (int i = 0; i < col; i++) {
            count[0][i] = 1;
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                count[i][j] = count[i-1][j] + count[i][j-1];
            }
        }
        return count[row-1][col-1];
    }
}
