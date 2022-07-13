package raj_coding.sort01and2;

public class Sort01And2WithBetter {

    public static void main(String[] args) {
        int [] arr = new int[]{0,0,1,1,1,2,1,2,0,0,0,1};
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

       while (mid<=high) {
           switch (arr[mid]){
               case 0:
                   int temp = 0;
                   temp = arr[low];
                   arr[low] = arr[mid];
                   arr[mid] = temp;
                   low++;
                   mid++;
                   break;
               case 1:
                   mid++;
                   break;
               case 2:
                    temp = arr[high];
                    arr[high]= arr[mid];
                    arr[mid]= temp;
                    high--;
                   break;
           }
       }
    }
}
