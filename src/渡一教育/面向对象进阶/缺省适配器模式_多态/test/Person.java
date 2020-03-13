package 渡一教育.面向对象进阶.缺省适配器模式_多态.test;

public class Person extends Animal{

    public String name = "父类的属性";
    public void eat(){
        System.out.println("人类的吃饭方法");
    }
    public void sleep(){
        System.out.println("人类的睡觉方法");
    }
    public void talk(){
        System.out.println("人类的说话方法");
    }
}
