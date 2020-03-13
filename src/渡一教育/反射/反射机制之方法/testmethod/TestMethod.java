package 渡一教育.反射.反射机制之方法.testmethod;

import org.omg.CORBA.TRANSACTION_MODE;
import 渡一教育.面向对象进阶.修饰符1.test_final.TestFinal;

import java.lang.reflect.Method;
import java.util.TreeMap;

public class TestMethod {

    public static void main(String[] args) {
        try {
            //获取Person对应的Class方法
            Class clazz = Person.class;
            Person p = (Person)clazz.newInstance();






            /*Method m =clazz.getDeclaredMethod("testPrivate");
            System.out.println(m.getName());
            m.setAccessible(true);//获取私有方法的访问权限
            m.invoke(p);
            Method[] ms = clazz.getDeclaredMethods();*/




            /*Method m = clazz.getMethod("sleep");//这个方法可以获取公有的方法（自己类加父类）
            m.invoke(p);
            Method[] m1 = clazz.getMethods();
            System.out.println(m1.length);*/




            /*//通过clazz获取其中的方法
            //      通过方法名字定为方法  通过方法参数类型对应的Class来寻找
            Method m = clazz.getMethod("eat");//获取无参数的吃饭方法
            Method m1 = clazz.getMethod("eat",String.class);//获取有参数的吃饭方法
            String result = (String)m1.invoke(p,"测试参数");//执行方法  （对象名，参数（没有就不写））
            System.out.println(result);*/




            /*int mm = m.getModifiers();//获取方法的修饰符
            Class mrt = m.getReturnType();//获取返回值数据类型
            String mn = m.getName();//获取方法的名字
            Class[] mpts = m.getParameterTypes();//获取方法的参数列表
            Class[] mets = m.getExceptionTypes();//获取方法抛出异常的类型*/







        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
