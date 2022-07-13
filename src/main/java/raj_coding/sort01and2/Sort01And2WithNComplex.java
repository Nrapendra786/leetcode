package raj_coding.sort01and2;

public class Sort01And2WithNComplex {
    public static void main(String[] args) {

        int [] array = new int[]{0,1,1,0,1,2,1,2,0,0,0,1};

        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for(int i=0; i < array.length; i++) {
            if(array[i] == 0) {
                cnt0++;
            } else if(array[i] == 1) {
                cnt1++;
            } else if(array[i] == 2) {
                cnt2++;
            }
        }

        int total = cnt0 + cnt1 + cnt2;
        System.out.println(cnt0 + "  " + cnt1 + "  " + cnt2 + " " + total);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i < total ;i++){
            if(i < cnt0) {
                stringBuilder.append(0);
            } else if(i > cnt0 && i <= (cnt0 + cnt1)) {
                stringBuilder.append(1);
            } else if(i > (cnt0 + cnt1) &&  i <= total) {
                stringBuilder.append(2);
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
