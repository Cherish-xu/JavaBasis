package 渡一教育.反射二刷._01;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @Author: 张天旭
 * @Date: 2020/3/16 17:26
 * @Version 1.0
 */
public class TestMain {

    public static void main(String[] args) {
        //通过一个Class对象来操作Persion.class类
        try {

            Class clazz = Class.forName("渡一教育.反射二刷._01.Persion");
            Persion p = new Persion();
            //获取私有属性
            Field f = clazz.getDeclaredField("name");
            System.out.println(f.getName());
            f.setAccessible(true);
            f.set(p,"张天旭");
            System.out.println(p);
            String value = (String) f.get(p);
            System.out.println(value);


//            //通过clazz获取类中的属性
//            Field nameField = clazz.getField("name");


//            //获取所有属性，包括继承父类的，如果父类的属性是私有的，则无法获取
//            // 只能获取公有的属性
//            Field[] fields = clazz.getFields();
//            System.out.println(fields.length);


//            //给属性赋值
//            nameField.set(p,"张天旭");
//            System.out.println(p);
//            //取出属性的值
//            String name = (String) nameField.get(p);
//            System.out.println(name);
//


//            //获取属性的修饰符
//            int modifiers =  nameField.getModifiers();
//            //获取属性的类型   ----  java.lang.String
//            Class fclass = nameField.getType();
//            System.out.println(fclass.getName());
//            //获取属性的名字
//            String fname = nameField.getName();
//            System.out.println(fname);




//            //创建对象 相当于调用了类中的默认无参的构造方法 返回值是Object类型的
//            Persion p = (Persion) clazz.newInstance();
//            System.out.println(p);


//            //目的是加载一个类（类加载是静态方法和块就执行了）
//            //返回值可以接收也可以不接收
//            Class clazz = Class.forName("渡一教育.反射二刷._01.Persion");
//            // 类自己的结构：权限修饰符   特征修饰符   类名字     继承  实现
//            // 返回一个int类型    表示类的修饰符（权限+特征）
//            // 0开始   0 1 2 4 8 16 32 64 128 256 512
//            // 0-默认  1-public  2-private  4-protected
//            // 8-static 16-final 32-synchronize
//            // 512-interface 1024-abstract
//            int modifier = clazz.getModifiers();
//            System.out.println(modifier);
//
//            //获取类全名 (包名加类名)
//            String name = clazz.getName();
//            System.out.println(name);
//            //获取类名字 (只是类名)
//            String simpleName = clazz.getSimpleName();
//            System.out.println(simpleName);
//
//            //获取类所在的包   返回值是个Package类型
//            Package p = clazz.getPackage();
//            System.out.println(p.getName());
//
//            //获取超类--父类
//            Class sclass = clazz.getSuperclass();
//            System.out.println(sclass.getName());

//            ArrayList<String> list = new ArrayList<>();
//            Class clazz = ArrayList.class;
//            Class sclass = clazz.getSuperclass();
//            while (sclass != null){
//                System.out.println(sclass.getName());
//                sclass = sclass.getSuperclass();
//            }

//            //获取当前class的所有父接口
//            Class[] classes = clazz.getInterfaces();
//            for (Class c: classes){
//                System.out.println(c.getName());
//            }
//


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
