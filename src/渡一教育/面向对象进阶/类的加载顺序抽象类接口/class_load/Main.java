package 渡一教育.面向对象进阶.类的加载顺序抽象类接口.class_load;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        //1.加载父类
        //2.父类产生自己的静态空间     属性  方法  块   执行块
        //      执行输出静态块中的方法
        //3.加载子类
        //4.子类产生自己的静态空间
        //      执行子类静态块中的方法
        //5.开辟对象空间
        //6.加载父类的非静态成员  属性  方法  块   构造方法
        //7.    执行块  执行构造方法
        //8.加载子类的非静态成员
        //9.    之星快 执行子类的构造方法
        //10.将对象空间的地址引用交给   变量来使用
    }
}
