package raj_coding.matrix_zero;

public class MatrixZeroAnotherWay {
    public static void main(String[] args) {
        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        setZeroes(arr);
        System.out.println("The Final Matrix is ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void setZeroes(int [][]matrix){
        int col0=1, rows = matrix.length , cols = matrix[0].length;

        for(int i = 0;i < rows; i++) {
            for(int j = 1 ; j < cols; j++) {
                if(matrix[i][j] == 0){
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }

        for(int i = rows - 1 ;i >=0; i--) {
            for(int j = cols - 1 ; j >=0; j--) {

                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j]=0;
                }
            }
        }









    }
}
