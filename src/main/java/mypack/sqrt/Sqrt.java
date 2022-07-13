package mypack.sqrt;

public class Sqrt {

    private static int floorSqrt(int x){
        if(x == 0 || x == 1)
            return 1;
        int sqrt = 1,count=0;
        for (int i = 1 ; i < x; i++) {
           if(i * i >= x){
               sqrt = i;
              break;
           }
        }
        return sqrt - 1;
    }

    public static void main(String[] args) {
        int x = 11;
        System.out.print(floorSqrt(x));
    }
}
