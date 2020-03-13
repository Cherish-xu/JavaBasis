package 渡一教育.面向对象进阶.缺省适配器模式_多态.test;

public class Student extends Person{

    public String name = "学生的属性";

    public void talk(){
        System.out.println("学生的说话方法");
    }

    public void study(){
        System.out.println("学生学习的方法");
    }
}
