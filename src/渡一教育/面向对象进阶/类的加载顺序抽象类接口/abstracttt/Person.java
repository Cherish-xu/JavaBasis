package 渡一教育.面向对象进阶.类的加载顺序抽象类接口.abstracttt;

public class Person extends Animal implements TestInterface{

    public void eat(){
        System.out.println("人类吃饭");
    }
    public void sleep(){
        System.out.println("人类睡觉");
    }

    @Override
    public void test() {

    }
}
