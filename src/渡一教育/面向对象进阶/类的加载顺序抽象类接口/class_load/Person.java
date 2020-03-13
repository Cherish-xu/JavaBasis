package 渡一教育.面向对象进阶.类的加载顺序抽象类接口.class_load;

public class Person extends Animal{

    public String test = "PersonlField";
    public static String testStatic = "PersonStaticField";

    public Person(){
        System.out.println("Person默认无参的构造方法");
    }
    {
        this.test();
        System.out.println("Person普通的块"+test);
    }
    static {
        Person.testStatic();
        System.out.println("Person静态的块"+testStatic);
    }

    public void testPerson(){
        System.out.println("我是Person类中的普通方法");
    }
    public static void testStatic(){
        System.out.println("我是Person类中的静态方法");
    }
}
