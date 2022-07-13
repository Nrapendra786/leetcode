package mypack.subsequence;

public class Application {
    public static void main(String[] args) {
        SubSequence subSequence = new SubSequence();
        System.out.println(subSequence.isSubsequence("aec","abcde"));
        System.out.println(subSequence.isSubsequence("ace","abcde"));
    }
}
