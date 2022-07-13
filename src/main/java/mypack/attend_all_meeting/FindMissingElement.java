package mypack.attend_all_meeting;

import java.util.ArrayList;
import java.util.List;

public class FindMissingElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,8,10};
        int n = 3 + arr.length;
        List<Integer> integers = findTwoMissingNumbers(arr,n);
        integers.stream().forEach(t -> System.out.println(t.intValue()));
    }

    public static List<Integer> findTwoMissingNumbers(int [] arr, int n) {

       List<Integer> missing_numbers = new ArrayList<Integer>();

        boolean [] num = new boolean[n];
        for(int i=0; i <= arr.length - 2 ; i++){
            num[arr[i]] = true;
        }

        for(int i=1; i < n ; i++){
            if(!num[i]){
                missing_numbers.add(i);
            }
        }
        return  missing_numbers;
    }
}