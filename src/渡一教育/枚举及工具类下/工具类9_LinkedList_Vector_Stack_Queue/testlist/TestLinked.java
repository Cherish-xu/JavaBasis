package 渡一教育.枚举及工具类下.工具类9_LinkedList_Vector_Stack_Queue.testlist;

import java.util.ArrayList;
import java.util.Arrays;

public class TestLinked {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        long time1 = System.currentTimeMillis();
        for (String v:arrayList){
            System.out.println(v);
        }
        long time2 = System.currentTimeMillis();
        System.out.println((time2-time1));
    }
}
