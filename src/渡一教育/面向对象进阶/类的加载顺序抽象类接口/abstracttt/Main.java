package 渡一教育.面向对象进阶.类的加载顺序抽象类接口.abstracttt;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
        p.sleep();
        Pig pig = new Pig();
        pig.eat();
        pig.sleep();

    }
}
