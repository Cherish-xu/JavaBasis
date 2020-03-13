package 渡一教育.反射.反射机制之方法.testconstructor;

import java.lang.reflect.Constructor;
import java.util.Collections;

public class TestConstructor {

    public static void main(String[] args) {
        try {
            //找到Person对应的class
            Class clazz = Person.class;
            Constructor[] cons = clazz.getConstructors();
            clazz.getDeclaredConstructor();//获取一个
            clazz.getDeclaredConstructors();//获取全部



            /*//找寻class中的无参数构造方法
            Constructor con = clazz.getConstructor(String.class);
            //执行构造方法
            Person p = (Person) con.newInstance("刘昭");
            System.out.println(p);

            con.setAccessible(true);//获取私有构造方法的访问权限

            con.getModifiers();//获取修饰符
            con.getName();//获取构造方法名字
            con.getParameterTypes();//获取构造方法参数
            con.getExceptionTypes();//获取构造方法异常*/


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
