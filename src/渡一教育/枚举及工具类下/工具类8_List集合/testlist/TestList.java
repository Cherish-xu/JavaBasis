package 渡一教育.枚举及工具类下.工具类8_List集合.testlist;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(100);
        list2.add(200);
        list2.add(300);

        //要把list2添加到list1中
        list1.addAll(list2);//将参数的元素插入到list1的后面.
        System.out.println(list1);

        list1.addAll(2,list2);//插入到指定位置
        System.out.println(list1);

        //list1.clear();//清除集合中的元素
        //System.out.println(list1);

        //判断是否存在
        boolean b = list1.contains(100);//参数是查看集合中是否存在参数元素
        System.out.println(b);

        int index = list1.indexOf(100);//查找这个元素的位置
        System.out.println(index);

        boolean ie = list1.isEmpty();//判断集合是否为空
        System.out.println(ie);//空返回true

        //list1.remove(10);//如果不知道要删除的值得索引，可以直接传入要删除的值
        //如果int型集合中，删除方法中传的值，不清楚是索引还是元素的值，按索引算
        //如果要删除的是元素的值，而不是元素的索引，则写成如下形式
        //list1.remove(new Integer(10));

        ArrayList<Integer> list3 = new ArrayList<Integer>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(100);
        /*list2.removeAll(list3);//差集
        System.out.println(list2);*/

        list2.retainAll(list3);//交集
        System.out.println(list2);

        int value = list1.set(2,300);//将指定位置索引的元素修改为指定的元素
        System.out.println(list1);

        List<Integer> list4 = list1.subList(2,4);//获取指定索引范围内的元素
        System.out.println(list4);

        //事先准备好一个空的数组-->用来接收返回值
        Integer[] x = new Integer[list1.size()];
        list1.toArray(x);//参数是用来接收的    这个参数可以是泛型的

        list1.trimToSize();//将集合变成有效元素个数那么长




    }
}
