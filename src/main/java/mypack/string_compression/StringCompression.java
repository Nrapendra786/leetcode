package mypack.string_compression;

import java.util.HashSet;
import java.util.Set;

public class StringCompression {

    public static void main(String[] args) {
        String s = "aabcccccaaa";
        char [] ch = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Set<String> hSet = new HashSet<>();
        int count =1;
        for(int i = 0;i < ch.length; i++) {
            if((i < ch.length - 1) && s.charAt(i) != s.charAt(i+1)) {
                stringBuilder.append(s.charAt(i)).append(count);
                count = 1;
            } else {
                if (i == ch.length -1) {
                    stringBuilder.append(s.charAt(i)).append(count);
                }
                count++;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
