package mypack.rotateArray;

public class RotateArray {

    public static void main(String[] args) {

        int[][] matrix = new int[][] {
                                { 1, 2, 3, 4 },
                                { 5, 6, 7, 8 },
                                { 9, 10, 11, 12 },
                                { 13, 14, 15, 16 }
                              };

       int [][] transpose =  transpose(matrix);
//       int [][] reverse =  reverse(transpose);

        System.out.println("real matrix is : ");
        printMatrix(matrix);
        System.out.println("transpose matrix is : ");
        printMatrix(matrix);
        System.out.println("reverse matrix is : ");
//        printMatrix(reverse);
    }

    private static int[][] transpose(int[][] matrix) {

        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }

    private static int[][] reverse(int[][] transpose) {

        int n = transpose.length;
        for(int i = 0 ; i < n ; i++) {
           int low = 0;
           int high = n - 1;
           while (low < high) {
               int temp = transpose[i][low];
               transpose[i][low] = transpose[i][high];
               transpose[i][high] = temp;
               low++;
               high--;
           }
        }
        return transpose;
    }

    public static void printMatrix(int[][] transpose) {
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print( "  " + transpose[i][j]  + "  ");
            }
            System.out.println();
        }
    }
}
