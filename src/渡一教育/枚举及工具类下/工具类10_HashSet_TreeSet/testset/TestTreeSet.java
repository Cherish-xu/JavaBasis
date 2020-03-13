package src.渡一教育.枚举及工具类下.工具类10_HashSet_TreeSet.testset;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<String> stringSet = new TreeSet<String>();
        stringSet.add("b");
        stringSet.add("C");
        stringSet.add("A");
        stringSet.add("c");
        stringSet.add("a");
        stringSet.add("B");
        stringSet.add("C");
        stringSet.add("a");
        System.out.println(stringSet.size());
        System.out.println(stringSet);
    }
}
