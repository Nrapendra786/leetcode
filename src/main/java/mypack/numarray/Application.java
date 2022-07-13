package mypack.numarray;

public class Application {
    public static void main(String[] args) {
        int[] val = new int []{1, 3, 5};
        NumArray numArray = new NumArray(val);
        System.out.println(numArray.sumRange(0,val.length));
        numArray.update(1,2);
        System.out.println(numArray.sumRange(0,val.length));
    }

}
