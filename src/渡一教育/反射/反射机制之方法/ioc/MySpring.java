package 渡一教育.反射.反射机制之方法.ioc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MySpring {

    //设计一个方法    控制对象的创建
    //是否需要参数？字符串（类全名）
    //是否需要返回值？对象Object
    public Object getBean(String className){
        Object obj = null;
        Scanner input = new Scanner(System.in);
        System.out.println("请给"+className+"类的对象赋值");
        try {
            Class clazz = Class.forName(className);
            //听过clazz创建对象
            obj = clazz.newInstance();
            //在这里做一个自动的DI注入     对象中的所有属性值
            //找到每一个不同对象中的所有set方法    给属性赋值
            //自己通过拼接字符串的方式处理名字
            //1.通过clazz找寻类中的所有私有属性-->获取每一个属性的名字-->set属性
            Field[] fields = clazz.getDeclaredFields();
            for (Field field:fields){
                //1.获取属性名字
                String fieldName =field.getName();
                //2.手动拼串
                String firstLetter = fieldName.substring(0,1).toUpperCase();//属性首字母变大写
                String otherLetter = fieldName.substring(1);//属性除了首字母之外的其他字母
                StringBuilder setMethodName = new StringBuilder("set");
                setMethodName.append(firstLetter);
                setMethodName.append(otherLetter);
                //3.获取field对应属性类型-->找寻set方法时传递参数用
                Class fieldClass = field.getType();
                //4.通过处理好的set方法名    找寻类中的set方法
                Method setMethod = clazz.getMethod(setMethodName.toString(),fieldClass);
                //5.找到的setMethod一执行     属性就赋值成功
                System.out.println("请给"+fieldName+"属性提供值");
                String value = input.nextLine();
                //需要执行属性对应的set方法    给属性赋值   方法就结束了
                Constructor con = fieldClass.getConstructor(String.class);
                setMethod.invoke(obj,con.newInstance(value));

            }




        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
        return obj;
    }
}
