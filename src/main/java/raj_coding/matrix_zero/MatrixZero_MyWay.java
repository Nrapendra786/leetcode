package raj_coding.matrix_zero;

public class MatrixZero_MyWay {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("" + matrix[i][j]);
            }
            System.out.println("");
        }

        int n = matrix[0].length;

        int[][] index_to_be_updated = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    for (int k = 0; k < n; k++) {
                        index_to_be_updated[i][k] = 0;
                        index_to_be_updated[k][j] = 0;
                    }
                }
            }
            System.out.println("");
        }

        for (int i = 0; i < index_to_be_updated[0].length; i++) {
            for (int j = 0; j < index_to_be_updated[0].length; j++) {
                System.out.print("" + index_to_be_updated[i][j]);
            }
            System.out.println();
        }
    }
}
