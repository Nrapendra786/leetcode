package mypack.rotate_array;

public class RotateArray {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7};
        for (int jForLoop = 0; jForLoop < 3; jForLoop++) {
            int []rotatedValues = rotateArray(values,3);
            print(rotatedValues);
        }
    }

    static void print(int[] values){
        int n = values.length;
        for(int i=0;i< n;i++) {
            System.out.print(values[i]);
        }
        System.out.println();
    }

    private static int[] rotateArray(int[] values, int noOfRotations) {
        int n = values.length;
        int temp = values[n - 1];
            for (int iForLoop = values.length - 1; iForLoop >= 0; iForLoop--) {
                if (iForLoop >= 1)
                    values[iForLoop] = values[iForLoop - 1];
                else
                    values[1] = values[0];
            }

        values[0] = temp;
        return values;
    }
}
