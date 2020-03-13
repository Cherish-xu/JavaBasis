package 渡一教育.面向对象进阶.缺省适配器模式_多态.test;

public class Teacher extends Person{

    public String name = "子类的属性";
    public void eat(){
        System.out.println("老师不按时吃饭");
    }

    public void teach(){
        System.out.println("老师的独有方法    讲课");
    }
}
