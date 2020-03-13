package 渡一教育.面向对象进阶.类与类关系练习.警车追击问题;

public class Velometer {

    //测速器测量小汽车速度    依赖关系
    public void measureCar(Car car){//测速器是与小车比时间的，警车是与小汽车比速度的
        //获取小汽车的速度
        int carSpeen = car.getSpeed();
        //计算小汽车的运行时间
        int carTime = 100/carSpeen;
        //小汽车与测速器的标准时间进行比较
        if (this.standardTime <= carTime){//没有超速
            System.out.println("速度正常符合标准，一路平安");
        }else {//超速
            System.out.println("超速了，请停车，警车进行追击");
            //需要一个警车对象  来追车
            //测速器发现小车超速，通知警车追击(观察者设计模式)
            PoliceCar policeCar = new PoliceCar(25);
            policeCar.chase(car);
        }
    }

    //属性--测速器规定的标准时间
    private int standardTime;

    //构造方法
    public Velometer(){}
    public Velometer(int standardTime){
        this.standardTime = standardTime;
    }

}
