package mypack.product_of_array_except_self;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {
        ProductOfArrayExceptSelf pa = new ProductOfArrayExceptSelf();
        int arr[] = { 10, 3, 5, 6, 2 };
        int n = arr.length;
        System.out.println("The product array is : ");
        int [] new_arr = pa.productExceptSelf(arr, n);
        print(new_arr);
    }

    private static void print(int [] arr){
        for(int i=0 ; i < arr.length ; i++) {
            System.out.print( "  " + arr[i] + "  ");
        }
    }

    public int[] productExceptSelf(int[] nums,int n) {
        int [] productArray = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            int j=i;
            productArray[i] = product(nums,nums.length,j);
        }
        return productArray;
    }

    public int product(int [] nums, int last_element, int not_included){
        int product=1;
      for(int i=0; i < last_element; i++){
          if(i!=not_included) {
              product = product * nums[i];
          }
      }
      return product;
    }


}
