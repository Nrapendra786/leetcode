package mypack.median;

public class CountSmallerOrEqualElements {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 8, 10 };
        int key = 11;
        int n = arr.length;
        System.out.print(binarySearchCount(arr, n, key));
    }

    private static int binarySearchCount(int []arr, int n, int key){

        int left = 0;
        int right = n - 1;

        int count=0;
        int mid = 0;

        while( left < right) {
            mid = (left + right)/2;
            if(arr[mid] <= key){
                count = mid + 1;
                left = mid + 1;
            } else {
                 right = mid - 1;
            }
        }
        return count +1;
    }
}
