package 渡一教育.面向对象进阶.策略模式_内部类.innerclass;

public class Main {
    public static void main(String[] args) {
        //内部类四属于外部类的    相当于是一个成员    需要外部类的对象才能操作
        //创建内部类的对象----调用内部类的方法
        //1.需要先创建外部类对象
        //Demo demo = new Demo();
        //Demo.InnerDemo innerDemo = demo.new InnerDemo();
        //调用内部类的方法
        //innerDemo.testInnerDemo();

        //静态成员内部类
        //Demo.InnerDemoStatic ids = new Demo.InnerDemoStatic();
        Demo.InnerDemoStatic.test();
    }
}
