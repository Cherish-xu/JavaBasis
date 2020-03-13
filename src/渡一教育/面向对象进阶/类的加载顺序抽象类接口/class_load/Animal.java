package 渡一教育.面向对象进阶.类的加载顺序抽象类接口.class_load;

public class Animal {

    public String test = "AnimalField";
    public static String testStatic = "AnimalStaticField";

    public Animal(){
        System.out.println("Animal默认无参的构造方法");
    }
    {
        this.test();
        System.out.println("Animal普通的块"+test);
    }
    static {
        Animal.testStatic();
        System.out.println("Animal静态的块"+testStatic);
    }

    public void test(){
        System.out.println("我是Animal类中的普通方法");
    }
    public static void testStatic(){
        System.out.println("我是Animal类中的静态方法");
    }
}
