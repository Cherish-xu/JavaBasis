package 渡一教育.反射二刷._02.ioc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @Author: 张天旭
 * @Date: 2020/3/17 14:58
 * @Version 1.0
 */
public class MySpring {

    //设计一个方法    帮我控制对象的创建
    //  参数：String  类全名
    //  返回值：    Object
    public Object getBean(String className){
        Object obj = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请给类"+className+"的对象赋值");
        try {

            Class clazz = Class.forName(className);
            //通过clazz创建一个对象
            obj = clazz.newInstance();

            //做一个依赖注入（DI）   对象中的所有属性赋值
            //找到每一个不同对象中的所有set方法    给属性赋值
            //自己通过拼接字符串的方式处理姓名
            //1.通过clazz找寻所有私有属性-->获取每一个属性的名字-->处理set属性
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                //获取属性名
                String fieldName = field.getName();
                //2.手动的拼串     拼接属性对应的set方法    setTitle  setAnswer
                //将属性名字的第一个字母变为大写
                String firstLetter = fieldName.substring(0, 1).toUpperCase();
                //除了首字母之外的名字
                String otherLetters = fieldName.substring(1);
                //拼接set方法名字
                StringBuilder setMethodName = new StringBuilder("set");
                setMethodName.append(firstLetter);
                setMethodName.append(otherLetters);
                //3.获取field对应的属性类型--->找寻set方法是传递参数用
                Class fieldClass = field.getType();
                //4.通过处理好的set方法名    找寻类中的set方法
                Method setMethod = clazz.getMethod(setMethodName.toString(), fieldClass);
                //5.找到setMethod执行   属性赋值成功
                System.out.println("请给"+fieldName+"属性赋值");
                String value = scanner.nextLine();
                //需要执行属性对应的set方法 给属性赋值 方法就结束啦
                //属性的值现在接收过来 (Scanner 文件内读取) 全都是String类型
                //执行set方法的时候 方法需要的值不一定都是String类型  Integer Float ... 属性类型的值
                //如何将所有的String类型的值--->转化成属性类型的值
                //Integer包装类  八个包装类有七个都含有带String的构造方法
                //  new Integer(String) new Float(String)  new String(String)
                //可以利用包装类带String的构造方法处理  属性类型对应的带String参数的构造方法
                Constructor con = fieldClass.getConstructor(String.class);
                setMethod.invoke(obj,con.newInstance(value));
            }
            //2.
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
