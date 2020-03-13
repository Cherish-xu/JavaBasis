package src.渡一教育.枚举及工具类下.工具类11_HashMap.testmap;

import java.util.TreeMap;

public class TestTreeMap {

    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(5,"e");
        map.put(2,"b");
        map.put(3,"c");
        map.put(7,"g");
        map.put(1,"a");
        map.put(8,"h");
        map.put(9,"i");
        map.put(4,"d");
        map.put(6,"f");
        System.out.println(map);
    }
}
