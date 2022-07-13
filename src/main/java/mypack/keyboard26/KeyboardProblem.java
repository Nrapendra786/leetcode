package mypack.keyboard26;

public class KeyboardProblem {

    public static void main(String[] args) {

        String S1="zyxwvutsrqponmlkjihgfedcba";

        String S2= "a";

        char []chToS2 = S2.toCharArray();

        int index1 = 0;
        int index2 = 0;
        int sum = 0;

        for (char index:chToS2) {
            int s1Index = S1.indexOf(index);
            sum += Math.abs(s1Index - index2);
            index1++;
            index2++;
        }

        System.out.println(sum);
    }
}
