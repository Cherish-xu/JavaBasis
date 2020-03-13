package 渡一教育.面向对象进阶.策略模式_内部类.bank;

public class Toff extends Person{
    public Toff(){}
    public Toff(String name) {
        this.name = name;
    }

    //1.进入银行    叫号  排队
    public void callNumber(){
        System.out.println("VIP客户，不需要排队");
    }
    //2.去窗口办理
    public void transact(){
        System.out.println("VIP客户有专门的房间办理，进入VIP室办理");
    }
    //3.办理完后离开
    public void leave(){
        System.out.println("潇洒的提着钱离开了");
    }
}
