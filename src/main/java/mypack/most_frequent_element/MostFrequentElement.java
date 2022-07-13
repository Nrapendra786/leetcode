package mypack.most_frequent_element;

public class MostFrequentElement {

    int mostFreqElement(int [] arr) {
        int count = 0;

       int max_count_so_far=0;

       int max_element_so_far=0;

       for(int i = 0 ; i < arr.length; i++) {
          for(int j=i+1; j < arr.length; j++){
              if((arr[i]) == (arr[j])) {
                  count++;
              }
          }

          if(max_count_so_far < count){
              max_count_so_far = count;
              max_element_so_far = (arr[i]);
          }
          count=0;
       }
       return  max_element_so_far;
    }

    public static void main(String[] args) {

        int [] int_array = new int[]{2, 2, 5, 50, 1};

        MostFrequentElement mostFrequentElement = new MostFrequentElement();

        System.out.println(mostFrequentElement.mostFreqElement(int_array));
    }
}
