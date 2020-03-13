package 渡一教育.面向对象进阶.修饰符1.person;

public class Main {
    public static void main(String[] args) {
        //创建类的过程是在Java中描述的过程
        //1.创建对象
        Person p = new Person();
        //2.对象的引用  .   调用属性
        p.name = "刘昭";
        p.setAge(19);
        p.sex = "男";

        System.out.println(p.name+"今年"+p.getAge()+"岁");
    }
}
