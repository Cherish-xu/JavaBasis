package 渡一教育.面向对象进阶.类与类关系练习.警车追击问题;

public class Car {

    //属性--速度
    private int speed;

    //构造方法
    public Car(){}
    public Car(int speed){
        this.speed = speed;
    }

    //提供一个方法获取小汽车的速度
    public int getSpeed(){
        return this.speed;
    }

}
