package mypack.slidingwindow;

import java.util.HashMap;

public class SlidingWindow {

    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int matched = 0;
        int start = 0;
        int minLength = s.length() + 1;
        int subStr = 0;
        for (int endWindow = 0; endWindow < s.length(); endWindow++) {
            char right = s.charAt(endWindow);
            if (map.containsKey(right)) {
                map.put(right, map.get(right) - 1);
                if (map.get(right) == 0)
                    matched++;
            }
            while (matched == map.size()) {
                if (minLength > endWindow - start + 1) {
                    minLength = endWindow - start + 1;
                    subStr = start;
                }
                char deleted = s.charAt(start++);
                if (map.containsKey(deleted)) {
                    if (map.get(deleted) == 0) matched--;
                    map.put(deleted, map.get(deleted) + 1);
                }
            }
        }
        System.out.println(matched);
        return minLength > s.length() ? "" : s.substring(subStr, subStr + minLength);
    }
}
