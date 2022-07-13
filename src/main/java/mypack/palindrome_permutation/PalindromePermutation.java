package mypack.palindrome_permutation;

public class PalindromePermutation {

    public static void main(String[] args) {
        String s = "tactcapapa";
        int[] frequencies = frequencyByWord(s);
        if (isPalindrome(frequencies)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    private static boolean isPalindrome(int[] frequencies) {
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] % 2 == 1)
                return false;
        }
        return true;
    }

    private static int[] frequencyByWord(String s) {
        int[] frequencies = new int[Character.getNumericValue('z') -
                Character.getNumericValue('a') + 1];
        for (Character ch :s.toCharArray()) {
            int x = getCharacterNumber(ch);
            if ( x != -1) {
                frequencies[x]++;
            }
        }
        return frequencies;
    }

    private static int getCharacterNumber(char ch) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(ch);
        if (val >= a && val <= z) {
            return val - a;
        }
        return -1;
    }
}
