package mypack.pythogorean_triplet;

public class PythongoreanTriplet {

    static boolean isTriplet(int []arr,int n){
       for(int i = 0 ; i < n; i++){
           for(int j = i + 1 ; j < n; j++){
               for(int k = j + 1 ; k < n; k++){
                    int x = arr[i] * arr[i]; int y = arr[j] * arr[j]; int z = arr[k] * arr[k];
                    if(x + y == z || x + z == y || y + z == x)
                        return true ;
               }
           }
       }
       return false;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 4, 6, 5 };
        int arr_size = arr.length;
        if (isTriplet(arr, arr_size) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
