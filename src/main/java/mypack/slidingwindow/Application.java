package mypack.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class Application {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String toMatch = "ABC";
       String minLength = new SlidingWindow().minWindow(s,toMatch);
        System.out.println(minLength);
    }
}
