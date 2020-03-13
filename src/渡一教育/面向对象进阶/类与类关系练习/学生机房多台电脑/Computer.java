package 渡一教育.面向对象进阶.类与类关系练习.学生机房多台电脑;

public class Computer {

    //属性--表示电脑的编号
    private int number;
    //属性--自己的状态     开或关
    private boolean used = false;//true==开着的     false==关着的

    //设计两个方法获取电脑的编号哈电脑的状态
    public int getNumber(){//获取电脑编号
        return this.number;
    }
    public boolean isUsed(){//获取电脑状态
        return this.used;
    }

    //设计构造方法
    public Computer(){}
    public Computer(int number){
        this.number = number;
    }

    //设计普通方法--被学生打开、使用、关闭
    public void beOpen(){
        this.used = true;//切换电脑为打开状态
        System.out.println(this.number+"号电脑被打开了");
    }

    public void beUsing(){
        System.out.println(this.number+"号电脑被使用中");
    }

    public void beClose(){
        this.used = false;//切换电脑为关闭状态
        System.out.println(this.number+"号电脑被关闭了");
    }
}
