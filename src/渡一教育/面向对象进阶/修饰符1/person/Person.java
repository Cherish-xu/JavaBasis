package 渡一教育.面向对象进阶.修饰符1.person;

public class Person {

    //属性
    public String name;
    private int age;
    public String sex;

    //方法
    //设计一个方法，用来取得age的值
    //条件？不需要        返回值？age
    public int getAge(){
        return this.age;
    }

    //设计一个方法，用来给age属性赋值
    //  提供条件 age的值      返回值 不用
    public void setAge(int age){
        if (age < 0){
            System.out.println("对比起您尚未出生，请给出正确的年龄");
            this.age = -1000;
            //抛出异常
        }else if (age > 130){
            System.out.println("对不起，您已经飞升了，请给出正确的年龄");
            this.age = -1000;
            //抛出异常
        }else {
            this.age = age;
        }
    }
}
