package 渡一教育.反射.反射机制.testreflect;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        try {
            /*//通过一个Class对象造作Person.class类文件
            Class clazz = Class.forName("渡一教育.反射.反射机制.testreflect.Person");

            //类自己有结构    权限修饰符   特征修饰符   类名字 继承  实现
            int modifiers = clazz.getModifiers();//获取类的修饰符（权限   特征）
            System.out.println(modifiers);

            //类的名字
            String name = clazz.getName();//获取类的名字
            String simpleName = clazz.getSimpleName();
            System.out.println(name);//类全名
            System.out.println(simpleName);//类名

            //获取类所在的包
            Package p = clazz.getPackage();
            System.out.println(p.getName());//获取包名

            //获取超类（父类）
            Class sClass = clazz.getSuperclass();
            System.out.println(sClass.getName());*/
//================================================================================================

            /*ArrayList<String> list = new ArrayList<String>();
            //获取集合对应的那个class
            Class clazz1 = ArrayList.class;
*/

           /* Class sclazz1 = clazz1.getSuperclass();
            if (sclazz1 != null){
                System.out.println(sclazz1.getName());
                sclazz1 = sclazz1.getSuperclass();
            }*/

           /*Class[] classes = clazz1.getInterfaces();//获取当前clazz1的所有父亲接口
            for (Class c:classes){
                System.out.println(c);
            }
*/
//================================================================================================

/*
            Class clazz2 = Class.forName("渡一教育.反射.反射机制.testreflect.Person");

            Person p = (Person)clazz2.newInstance();//相当于调用person类中的默认无参构造方法创建的对象
            //返回值是Object类型的所以创建一个对象接收
            System.out.println(p);
            //调用的是无参的构造方法，所以如果重写构造方法，会出现错误*/
//================================================================================================
            //通过反射的技术得到一个Class对象
            Class clazz3 = Class.forName("渡一教育.反射.反射机制.testreflect.Person");
            Person p = (Person)clazz3.newInstance();
            //通过clazz3来获取类中的属性

             /*//先看属性自己的结构     赋值     取值
            int modifier = nameField.getModifiers();//属性的修饰符
            System.out.println(modifier);
            Class fclass = nameField.getType();//获取属性的类型
            System.out.println(fclass.getName());
            String fname = nameField.getName();//获取属性的名字
            System.out.println(fname);*/

            /*Field nameField = clazz3.getField("name");//需要知道属性的名字   并且属性要是公有的
            Field[] fields = clazz3.getFields();//这两个方法不能获取私有的属性
            System.out.println(fields.length);
            //通过属性赋值
            nameField.set(p,"刘昭");
            //取值
            String name = (String)nameField.get(p);
            System.out.println(name);*/


            Field f = clazz3.getDeclaredField("name");//私有属性也可以获取
            System.out.println(f.getName());
            f.setAccessible(true);//表示私有的属性可以直接被操作,需要在操作前加上这一行代码
            f.set(p,"张天旭");//只可以获取私有属性，但私有属性不可以操作、更改
            String value = (String)f.get(p);
            System.out.println(value);

            Field[] fields = clazz3.getDeclaredFields();//这两个方法可以获取私有和公有的属性，但继承的属性不可获取
            System.out.println(fields.length);











            //每一个修饰符    用一个整数来进行表示
            //0开始--1 2 4 8 16 32 64 128 256 512
            //0--默认不写   1--public   2--private  4--protected    8--static   16--final
            //32--synchromized  64--volatile    128--transient      512--interface


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
