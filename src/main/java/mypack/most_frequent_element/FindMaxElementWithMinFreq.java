package mypack.most_frequent_element;

public class FindMaxElementWithMinFreq {

    public int[] leastFreqElement(int [] arr) {

        int [] least_freq_element = new int[arr.length];
        int count =1;
        int least_fre_elem=1;
        int length = arr.length;

        for (int i = 0 ; i < length; i++){
           for(int j = i + 1; j < length; j++) {
               if(arr[i] == arr[j]){
                   count++;
               }
           }
           if (least_fre_elem > count) {
               least_fre_elem=count;
               least_freq_element[i] = arr[i];
           }
           count=1;
        }
        System.out.println(least_fre_elem);
        return least_freq_element;
    }

    public static void main(String[] args) {

        int [] int_array = new int[]{2, 2, 5, 50, 1};

        FindMaxElementWithMinFreq findMaxElementWithMinFreq = new FindMaxElementWithMinFreq();

        int [] least_freq_elem =  findMaxElementWithMinFreq.leastFreqElement(int_array);

        for(int i = 0 ; i < least_freq_elem.length; i++) {
            System.out.println(least_freq_elem[i]);
        }
    }
}
