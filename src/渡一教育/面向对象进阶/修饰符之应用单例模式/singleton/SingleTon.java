package 渡一教育.面向对象进阶.修饰符之应用单例模式.singleton;

public class SingleTon {
    //通过我的设计 让这个类只能创建一个对象

    //每一个类都有一个默认无参数的方法----公有
    //1.让构造方法变成私有的---保证外边不能随便的创建对象
    private SingleTon(){}
    //2.单例  不是无例----在本类中的某个成员位置上创建唯一的一个对象
    //3.在当前类中存在一个属性 是当前类类型的
    public static SingleTon single = new SingleTon();



    public static void  main(String[] args) {
        new SingleTon();
    }
}
