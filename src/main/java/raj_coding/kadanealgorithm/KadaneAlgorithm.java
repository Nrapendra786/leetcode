package raj_coding.kadanealgorithm;

public class KadaneAlgorithm {

    public static void main(String[] args) {

        int [] arr = new int []{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max_so_far = 0;
        int best_sum = 0;
        for(int i = 0 ; i < arr.length ; i++) {
            max_so_far = Math.max(arr[i] , max_so_far + arr[i]);
            best_sum = Math.max(best_sum , max_so_far);
        }
        System.out.println(best_sum);
    }
}
