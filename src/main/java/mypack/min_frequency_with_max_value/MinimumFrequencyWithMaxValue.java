package mypack.min_frequency_with_max_value;

import java.util.*;

public class MinimumFrequencyWithMaxValue {

    public static void main(String[] args) {

        int[] int_values = new int[]{2, 2, 5, 50, 1};
        int[] min_freq = new int[int_values.length];
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int value : int_values) {
            if (!hashMap.containsKey(value)) {
                hashMap.put(value, 1);
            } else {
                hashMap.put(value, hashMap.get(value) + 1);
            }
        }
        print(hashMap);
    }

    private static void print(HashMap<Integer, Integer> hashMap) {

        int[] min_freq = new int[hashMap.size()];
        int index = 0;

        for (int key : hashMap.keySet()) {
            int value = hashMap.get(key);
            min_freq[index] = value;
            index++;
        }

        int min = findMinElement(min_freq);

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (Integer key : hashMap.keySet()) {
            if(hashMap.get(key) == min){
               treeMap.put(key,hashMap.get(key));
            }
        }

        int maxValue = treeMap.keySet().stream().max(Integer::compareTo).get();

        System.out.println(maxValue);
    }

    private static int findMinElement(int[] min_freq) {
        int min = min_freq[0];
        for(int i = 0 ; i < min_freq.length; i++) {
            if(min > min_freq[i]){
                min = min_freq[i];
            }
        }
        return min;
    }
}



