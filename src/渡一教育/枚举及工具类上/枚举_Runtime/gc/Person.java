package 渡一教育.枚举及工具类上.枚举_Runtime.gc;

public class Person {

    //默认继承Object

    public Person(){
        System.out.println("person对象被创建");
    }

    public void finalize(){
        System.out.println("person对象呗回收了");
    }
}
