package 渡一教育.反射.反射机制.testreflect;

import java.lang.reflect.Field;

public class ChangeStringValue {

    public static void main(String[] args) throws Exception {
        String str = "abc";
        System.out.println(str);
        //反射的技术是可以获取私有属性的   可以操作私有属性    但是不合理
        //1.获取Sting类对应的那个class
        Class clazz = str.getClass();
        //通过clazz获取类中的value属性
        Field field = clazz.getDeclaredField("value");
        //3.直接操作属性的值    设置私有属性可以被操作
        field.setAccessible(true);//可以修改属性被操作的状态
        //4.获取value属性里面的值（内存地址）
        char[] temp = (char[])field.get(str);
        //通过temp的地址引用找到真实String对象中的数组   修改数组内的每一个元素
        temp[0] = '张';
        temp[1] = '天';
        temp[2] = '旭';
        //最终输出一个str值
        System.out.println(str);
    }
}
