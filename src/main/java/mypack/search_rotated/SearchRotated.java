package mypack.search_rotated;

public class SearchRotated {
    public static void main(String[] args) {

        int [] array = new int[]{ 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int [] arr = targetRotateArray(array,target);
        boolean found=false;
        int index =0;
        for(int i = 0 ; i < array.length; i++) {
            System.out.print( "  " + arr[i] + "  ");
            if (arr[i] == target) {
                index  = i;
                found=true;
            }
        }
        if(found)
            System.out.println("index is: " + index);
        else
            System.out.println("-1");
    }

    private static int[] targetRotateArray(int [] array,int target){
        for(int i=0;i<target;i++){
           array = rotateArray(array);
        }
        return array;
    }

    private static int[] rotateArray(int [] arr) {
       int temp = arr[arr.length -1];
       for (int i = arr.length - 1; i >= 0; i--) {
            if(i-1>=0) {
                arr[i] = arr[i - 1];
            } else {
                arr[1] = arr[0];
            }
       }
       arr[0] = temp;
       return arr;
    }
}
