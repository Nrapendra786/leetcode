package mypack.one_edit_away;

public class OneEditAway {

    public static void main(String[] args) {
        String s = "Ple";
        String t = "Pale";
        if(isOneEditAway(s,t)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    private static boolean isOneEditAway(String s,String t){
        int count =0;
        if(s.length() == t.length()){
            char []sCharArray = s.toCharArray();
            char []tCharArray = t.toCharArray();
            int len = sCharArray.length;
            for(int i = 0; i < len; i++) {
               if(sCharArray[i] != tCharArray[i]){
                   count++;
               }
            }
        } else if(s.length() < t.length()){
            return t.contains(s);
        } else if(s.length() > t.length()){

        }
        return count == 1;
    }
}
