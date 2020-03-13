package 渡一教育.直播课.NewReflect.test;

import 渡一教育.直播课.NewReflect.domain.Person;
import 渡一教育.直播课.NewReflect.domain.TestInterface;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        //1.想要操作Person类 需要先获取Person对应的那个class
        //1)
        //Class clazz = Class.forName("渡一教育.直播课.NewReflect.domain.Person");
        /*//2)
        Class clazz1 = Person.class;*/
        /*//3)
        Person p = new Person();
        Class clazz2 = p.getClass();*/

        /*//类的结构
        //1.名字  2.修饰符   3.继承  实现关系
        String name = clazz.getName();//名字
        System.out.println(name);
        int mod = clazz.getModifiers();//修饰符对应的数字
        System.out.println(mod);
        Class superClass = clazz.getSuperclass();//父类对应的Class
        Class[] interfaces = clazz.getInterfaces();//父类接口对应的class*/

        /*//进一步操作
        //操作类当中的成员  属性  方法  构造方法
        Field field = clazz.getField("name");//里面需要一个属性名
        int modifier  = field.getModifiers();
        //  权限+特征修饰符一块产生
        System.out.println(modifier);*/


        //String的不可变特性
        //  长度不可变   内容不可变

        //Strinf是不可改变的  但是可以变   怎么理解？？  不可变的是长度 可变的是内容
        //反射    通过反射技术可以直接操作类中的成员
        //对于反射来说    私有等于没有

        String value = "爱德华";
        System.out.println(value);

        //想操作String类中的那个value属性
        //1.获取String的class
        Class clazz = String.class;
        //2.获取String类中的value属性
        Field field = clazz.getDeclaredField("value");//可以获取私有的属性
        //3.设置属性操作权限
        field.setAccessible(true);
        //4.操作属性    value属性有几个  属性：类描述的     类中的对象操作属性
        // 属性每一个对象中有一个
        //  获取属性中的内容   属性是哪一个对象中的属性
        char[] fieldValue = (char[]) field.get(value);
        //5.修改char数组中的内容
        fieldValue[0] = '刘';
        fieldValue[1] = 'd';
        fieldValue[2] = '花';
        System.out.println(fieldValue);


    }
}
