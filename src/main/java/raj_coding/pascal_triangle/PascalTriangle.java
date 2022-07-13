package raj_coding.pascal_triangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {


    public static void main(String[] args) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();

        int n =5;

        List<Integer> row,pre = null;

        for(int i=0;i < n ;i++){
            row = new ArrayList<>();
            for(int j = 0 ;j < i ;++j){
                if(i == 0 || i == 1) {
                    row.add(1);
                } else {
                    row.add(pre.get(j) + pre.get(j-1 < 0 ? 0 : j-1));
                }
            }
            pre = row;
            res.add(row);
        }


        for(int i = 1;i <= n ;i++){
            for(int j = 1 ;j <= i ;j++){
                System.out.print(res.get(i));
            }
            System.out.println();
        }

    }


}
