package 渡一教育.反射二刷._01;

import java.lang.reflect.Field;

/**
 * @Author: 张天旭
 * @Date: 2020/3/16 21:20
 * @Version 1.0
 */
public class ChangeStringValue {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String str = new String("abc");
        System.out.println(str);
        //1.获取String类对应的那个class
        Class clazz = str.getClass();
        //2.通过clazz获取类中的属性
        Field field = clazz.getDeclaredField("value");
        //3.设置私有属性可以被操作
        field.setAccessible(true);
        //4.private final char[] value
        // 获取value属性里面的值（内存地址）
        // 通过temp的地址引用  找到真实String对象中的数组    修改数组内的每一个元素`
        char[] temp = (char[])field.get(str);
        temp[0] = 'z';
        System.out.println(str);

    }
}
