package mypack.longest_substring;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

     public int value(String value) {
         if(value.length()==0)
             return value.length();

         int right = 0;
         int left = 0;
         int longest = 0;

         char []ch = value.toCharArray();

         Set<Character> characterSet = new HashSet<>();
         int n = value.length();
         while(right < n) {
             if (!characterSet.contains(value.charAt(right))) {
                 characterSet.add(value.charAt(right));
                 right++;
             } else {
                 characterSet.remove(value.charAt(left));
                 left++;
             }
             longest = Math.max(longest, right - left);
         }

         characterSet.stream().forEach(t -> System.out.println(t));

         return longest;
    }
}
