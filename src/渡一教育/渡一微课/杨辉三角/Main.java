package src.渡一教育.渡一微课.杨辉三角;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        List<List<Integer>> x = main.generate(5);
        System.out.println(x);
    }

    public List<List<Integer>> generate(int numRows){
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0;i < numRows;i++){
            List<Integer> row = new ArrayList<>();
            for (int j = 0;j <= i;j++){
                if (j == 0 || j == i){
                    row.add(1);
                }else {
                    int a = result.get(i-1).get(j-1);
                    int b = result.get(i-1).get(j);
                    row.add(a+b);
                }
            }
            result.add(row);
        }
        return result;
    }

}
