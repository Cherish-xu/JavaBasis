package 渡一教育.面向对象进阶.修饰符2.test_static;

public class Person {

    public String name;
    public static int age;

    static {
        System.out.println("静态块");
    }
    //构造方法
    public Person(){
        System.out.println("构造方法");
    }
    public void test(){
        System.out.println("普通方法");
    }
    public static void testStatic(){
        System.out.println("静态方法");
    }


    public static void main(String[] args) {
        //加载一个Person的类模板
        try {
            //类的全名  反射机制
            Class.forName("渡一教育.面向对象进阶.修饰符2.test_static.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
        }



       /* Person p1 = new Person();
        p1.name = "刘昭";
        p1.age = 18;
        Person p2 = new Person();
        p2.name = "张天旭";
        p2.age = 17;
        System.out.println(p1.name+"今年"+p1.age+"岁.");
        System.out.println(p2.name+"今年"+p2.age+"岁.");*/
    }

}
