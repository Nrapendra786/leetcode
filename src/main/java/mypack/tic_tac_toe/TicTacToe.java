package mypack.tic_tac_toe;

public class TicTacToe {

    public static void main(String[] args) {

        int[][] matrix = new int[][]{
                {1, 3, 4},
                {8, 4, 7},
                {4, 10, 1}
        };

        if (checkWinnerByRow(matrix)) {
            System.out.println("Won By Row");
        } else if (checkWinnerByColumn(matrix)) {
            System.out.println("Won By Column");
        } else if (checkWinnerByDiagonal(matrix)) {
            System.out.println("Won By Diagonal");
        }
    }

    private static boolean checkWinnerByRow(int[][] matrix) {
        int size = matrix[0].length;
        int count = 0;
        boolean isWinnerFound = false;

        for (int i = 0; i < size && !isWinnerFound; i++) {
            count = 0;
            for (int j = 0; j < size - 1 && !isWinnerFound; j++) {
                if (matrix[i][j] == matrix[i][j + 1]) {
                    count++;
                }

                if (count == 2) {
                    isWinnerFound = true;
                    break;
                }
            }
        }
        return count == 2;
    }

    private static boolean checkWinnerByColumn(int[][] matrix) {
        int size = matrix[0].length - 1;
        int count = 1;
        boolean isWinnerFound = false;

        for (int i = 0; i < size && !isWinnerFound; i++) {
            count = 0;
            for (int j = 0; j < size - 1 && !isWinnerFound; j++) {
                if (matrix[j][i] == matrix[j + 1][i]) {
                    count++;
                }
                if (count == size) {
                    isWinnerFound = true;
                    break;
                }
            }
        }
        return count == size;
    }

    private static boolean checkWinnerByDiagonal(int[][] matrix) {
        int size = matrix[0].length -1;
        int count = 1;
        boolean isWinnerFound = false;

        for (int i = 0; i < size && !isWinnerFound; i++) {
            int low = 0, high = size;
            while (low < high) {
                if (matrix[i][low] == matrix[high][high]) {
                    count++;
                }
                low++;
                high--;
            }
        }
        return count == size ;
    }

    private static boolean checkWinnerByDiagonalFromOtherSide(int[][] matrix) {
        int size = matrix[0].length -1;
        int count = 1;
        boolean isWinnerFound = false;

        for (int i = 0; i < size && !isWinnerFound; i++) {
            int low = 0, high = size;
            while (low < high) {
                if (matrix[low][high] == matrix[high][low]) {
                    count++;
                }
                low++;
                high--;
            }
        }
        return count == size;
    }
}
