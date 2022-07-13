package mypack.longest_palindrome;

public class LongestPalindromeMyWay {

    public static void main(String[] args) {
        String s = "abac";
        int low = 0;
        int high = s.length() - 1;
        boolean isPalindrome = false;
        while (low < high) {
            char first_char = s.charAt(low);
            char second_char = s.charAt(high);
            if(first_char == second_char) {
                String subStr = s.substring(low,high + 1);
                System.out.println(subStr);
                if(isPalindrome(subStr)){
                    isPalindrome=true;
                    System.out.println("Palindrome");
                }
                break;
            } else if( first_char != second_char && low != high) {
                  high--;
            } else if(high - low == 1) {
                low++;
            }
        }

        if(!isPalindrome) {
            System.out.println("Not Palindrome");
        }
    }

    private static boolean isPalindrome(String s) {
        int count = 0;
        int low = 0;
        int high = s.length() - 1;
        while( low < high){
            if(s.charAt(low) == s.charAt(high)){
                count++;
            } else {
                break;
            }
            low++;
            high--;
        }
        return count == s.length()/2;
    }
}
