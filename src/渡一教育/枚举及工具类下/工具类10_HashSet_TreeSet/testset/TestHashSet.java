package src.渡一教育.枚举及工具类下.工具类10_HashSet_TreeSet.testset;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {

    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<String>();
//        set.add("a");
//        set.add("b");
//        set.add("c");
//        set.add("a");
//
//        //获取一个迭代器，通过set集合获取
//        Iterator<String> it = set.iterator();
//        //判断下一个位置是否有元素
//        while (it.hasNext()){
//            String value = it.next();
//            System.out.println(value);
//        }


        HashSet<String> stringSet = new HashSet<String>();
        stringSet.add(new String("郑中拓"));
        stringSet.add(new String("郑中拓"));
        stringSet.add(new String("郑中拓"));
        stringSet.add(new String("郑中拓"));
        stringSet.add(new String("郑中拓"));
        System.out.println(stringSet.size());

        HashSet<Person> personSet = new HashSet<Person>();
        personSet.add(new Person("郑中拓"));
        personSet.add(new Person("郑中拓"));
        personSet.add(new Person("郑中拓"));
        personSet.add(new Person("郑中拓"));
        personSet.add(new Person("郑中拓"));
        System.out.println(personSet.size());









    }
}
