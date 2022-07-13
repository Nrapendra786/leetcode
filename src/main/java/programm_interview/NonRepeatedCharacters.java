package programm_interview;

import java.util.HashMap;

public class NonRepeatedCharacters {

    public static void main(String[] args) {
        String str = "teeter";
        String value = getValue(str);
        System.out.println(value);
    }

    private static String getValue(String str){
        HashMap<Integer, Object> charHash = new HashMap<>();

        Object seenOnce = new Object();
        Object seenMultiple = new Object();
        Object seen;
        int i;
        final int length = str.length();
        for (int k = 0; k < length; k++) {
            final int cp = str.codePointAt(k);
            k += Character.charCount(cp);
            seen = charHash.get(cp);
            if (seen == null) {
                charHash.put(cp,seenOnce);
            } else {
                if(seen == seenOnce){
                    charHash.put(cp,seenMultiple);
                }
            }
        }

        //search hashtable in order of str
        for(int j = 0; j < length;){
            final int cp = str.codePointAt(j);
            j +=Character.charCount(cp);
            if(charHash.get(cp) == seenOnce){
                return new String(Character.toChars(cp));
            }
        }
        return null;
    }
}
