package 渡一教育.反射二刷._02.testconstructor;

import java.lang.reflect.Constructor;

/**
 * @Author: 张天旭
 * @Date: 2020/3/17 11:56
 * @Version 1.0
 */
public class TestConstructor {

    public static void main(String[] args) {
        try {
            //找到Persion类
            Class clazz = Persion.class;

            //获取全部的构造方法(公有的)
            Constructor[] constructors = clazz.getConstructors();
            //获取全部的构造方法（公有加私有）
            Constructor[] constructors1 = clazz.getDeclaredConstructors();


//            //找到clazz中的无参构造方法
//            //  无参就不传参数     有参数就穿参数对应的类型的Class
//            Constructor con = clazz.getConstructor(String.class);

//            //获取构造方法修饰符
//            int cm = con.getModifiers();
//            //获取构造方法名字
//            String name = con.getName();
//            //获取构造方法参数列表
//            Class[] cp = con.getParameterTypes();
//            //获取构造方法抛出的异常
//            Class[] ce = con.getExceptionTypes();


//            //执行构造方法
//            Persion p = (Persion) con.newInstance("name");
//            System.out.println(p);




        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
