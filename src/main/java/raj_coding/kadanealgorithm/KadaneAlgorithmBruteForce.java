package raj_coding.kadanealgorithm;

public class KadaneAlgorithmBruteForce {

    public static void main(String[] args) {

        int [] arr = new int []{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max_so_far = 0;
        int best_sum = 0;
        int s = 0;
        int k=0;
        for(int i = 0 ; i < arr.length ; i++) {
            max_so_far += arr[i];
            if(max_so_far < 0){
                max_so_far = 0;
                s = i + 1;
            }
            if(best_sum < max_so_far){
                best_sum = max_so_far;
                k= i;
            }
        }
        System.out.println(best_sum);

        for(int i = s ; i <= k ; i++) {
            System.out.print(" " + arr[i] + " ");
        }
    }
}
