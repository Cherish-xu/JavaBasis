package 渡一教育.面向对象进阶.策略模式_内部类.bank;

public class OldMan extends Person{
    public OldMan(){}
    OldMan(String name){
        this.name = name;
    }

    //1.进入银行    叫号  排队
    public void callNumber(){
        System.out.println("老年人叫号，请人帮忙");
    }
    //2.去窗口办理
    public void transact(){
        System.out.println("去窗口拿出存折取钱");
    }
    //3.办理完后离开
    public void leave(){
        System.out.println("办理完毕离开");
    }
}
