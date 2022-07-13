package raj_coding.sort01and2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Sort01And2 {

    public static void main(String[] args) {

        //int [] nums = new int[]{2,0,2,1,1,0};
        int [] nums = new int[]{2,0,1};

        Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
        for(int i : nums){
            if(map.containsKey(i)){
                map.put(i , map.get(i) + 1);
            } else {
                map.put(i , 1);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int key : map.keySet()) {
            int value = map.get(key);
            for (int k=0;k<value;k++) {
                stringBuilder.append(key);
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
