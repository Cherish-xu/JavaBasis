package 渡一教育.面向对象进阶.策略模式_内部类.bank;

public abstract class Person {

    protected String name;

    public String getName() {
        return name;
    }

    //1.进入银行    叫号  排队
    public abstract void callNumber();
    //2.去窗口办理
    public abstract void transact();
    //3.办理完后离开
    public abstract void leave();
}
