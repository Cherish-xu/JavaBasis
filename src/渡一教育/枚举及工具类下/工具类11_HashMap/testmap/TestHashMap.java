package src.渡一教育.枚举及工具类下.工具类11_HashMap.testmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TestHashMap {

    public static void main(String[] args) {
        //创建一个hashMap
        HashMap<Integer,String> map = new HashMap<>();
        //将一些key -- value存入集合
        map.put(2,"bbb");
        map.put(5,"eee");
        map.put(6,"aaa");
        map.put(4,"ddd");
        map.put(3,"ccc");
        map.put(6,"xxx");
        map.put(1,"aaa");

        //先获取所有的key
        Set<Integer> keys = map.keySet();
        //通过迭代器遍历
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()){
            Integer key = it.next();
            String valud = map.get(key);
        }

        //System.out.println(map);
    }
}
