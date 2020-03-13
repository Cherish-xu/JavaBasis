package 渡一教育.面向对象进阶.策略模式_内部类.bank;

public class YoungMan extends Person{
    public YoungMan(){}
    public YoungMan(String name) {
        this.name = name;
    }

    //1.进入银行    叫号  排队
    public void callNumber(){
        System.out.println("年轻人叫号，很熟练，轻车熟路");
    }
    //2.去窗口办理
    public void transact(){
        System.out.println("去窗口汇款");
    }
    //3.办理完后离开
    public void leave(){
        System.out.println("办理完成，快速离开");
    }
}
