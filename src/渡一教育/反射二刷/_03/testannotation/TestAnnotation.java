package 渡一教育.反射二刷._03.testannotation;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

/**
 * @Author: 张天旭
 * @Date: 2020/3/17 19:45
 * @Version 1.0
 */
public class TestAnnotation {

    public static void main(String[] args) {
        //当前系统的时间
//        Date date = new Date();
//        //已废弃的    @Deprecated
//        date.getYear();


//        // 注解括号里是一个数组，如果只有一个的话就可以不加大括号
//        //unused -- 变量定义后未被使用
//        @SuppressWarnings("unused")
//        String str = "abc";
//
//        ArrayList<String> list = new ArrayList<String> ();
//        System.out.println(list);
        try {
            // 是HashTable的子类    是一个Map类型的集合
            // map是读取集合对象内的元素
            // 他是读取文件中的东西-----（高级流）
            Properties properties = new Properties();
            // 读取的文件后缀是.properties
            // 文件中的内容是一key-value形式存在的
            properties.load(new FileReader("src//渡一教育//反射二刷//_03//testannotation//Test.properties"));

            // 读取文件中所有的键
            Enumeration en = properties.propertyNames();
            // iteration    it.hasNext()           it.next
            // enumeration  en.hasMoreElements()   en.next()
            while (en.hasMoreElements()){
                String key = (String) en.nextElement();
                System.out.println(properties.getProperty(key));
            }

            // 通过键获取值
//            String value = properties.getProperty("key1");
//            System.out.println(value);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
