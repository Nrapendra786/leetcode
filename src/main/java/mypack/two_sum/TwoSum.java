package mypack.two_sum;

public class TwoSum {

    public static void main(String[] args) {

        int [] twoSums = new int[]{1 , 4 , 5 , 11 , 12};

        int [] response = targetSum(twoSums,9);

        for (int resp : response) {
            System.out.print("  " + resp + "  ");
        }
    }

    public static int[] targetSum(int[] nums, int target) {
        int left = 0 , right = nums.length - 1;

        while(left < right) {

            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{ left++ , right++ };
            }

            if(sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{ -1, -1};
    }
}
