package raj_coding.matrix_zero;

import java.util.Arrays;

public class MatrixZero {
    //[[0,1,2,0],[3,4,5,2],[1,3,1,5]]

    public static void main(String[] args) {
        int [][]matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        int row = matrix.length;
        int col = matrix[0].length;

        int []dummy1 = new int[row];
        int []dummy2 = new int[col];

        for(int i= 0 ; i < row; i++) {
            for(int j = 0; j < col ; j++){
                System.out.print("  " + matrix[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();

        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);

        for(int i= 0 ; i < row; i++) {
            for(int j = 0; j < col ; j++){
               if(matrix[i][j] == 0){
                   dummy1[i]=0;
                   dummy2[j]=0;
               }
            }
        }

        for(int i= 0 ; i < row; i++) {
            for(int j = 0; j < col ; j++){
                if(dummy1[i] == 0 || dummy2[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i= 0 ; i < row; i++) {
            for(int j = 0; j < col ; j++){
                System.out.print("  " + matrix[i][j] + " ");
            }
            System.out.println();
        }



    }


}
