package 渡一教育.反射二刷._02;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: 张天旭
 * @Date: 2020/3/17 10:18
 * @Version 1.0
 */
public class TestMethod {

    public static void main(String[] args) {
        try {
            //获取Persion对应的Class
            Class clazz = Persion.class;
            Persion p = (Persion) clazz.newInstance();




//            //获取私有的方法
//            Method m = clazz.getDeclaredMethod("testPrivate");
//            // 设置可以调用私有方法
//            m.setAccessible(true);
//            m.invoke(p);


//            //可以获取公有的方法----本类的和继承的都可以
//            Method m = clazz.getMethod("sleep");
//            m.invoke(p);


//            //可以获取所有的方法（本类加父类）  但是只能是公有的
//            Method[] methods = clazz.getMethods();


//            //通过clazz获取他的方法
//            // 通过方法名定位方法    通过方法的参数类型来找寻是哪个方法
//            Method m = clazz.getMethod("eat",String .class);
//            //执行
//            String result = (String) m.invoke(p,"测试参数");
//            System.out.println(result);


//            //获取方法的修饰符
//            int mm = m.getModifiers();
//            //获取属性的返回值类型
//            Class mrt = m.getReturnType();
//            //获取方法对的名字
//            String mn = m.getName();
//            //获取方法参数列表的类型
//            Class[] mpts = m.getParameterTypes();
//            //获取方法抛出异常的类型
//            Class[] mets = m.getExceptionTypes();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
