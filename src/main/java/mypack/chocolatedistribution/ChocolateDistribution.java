package mypack.chocolatedistribution;

import java.util.Arrays;

public class ChocolateDistribution {

    public static void main(String[] args) {
        int k = 7;
        int arr[] = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        Arrays.sort(arr);
        int min_diff=Integer.MAX_VALUE;
        for (int i = 0; i + k - 1 < arr.length ; i++) {
            int diff = arr[i+k-1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
        }
        System.out.println(min_diff);
    }
}
