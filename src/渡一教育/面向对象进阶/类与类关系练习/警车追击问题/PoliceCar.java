package 渡一教育.面向对象进阶.类与类关系练习.警车追击问题;

public class PoliceCar {

    //警车追击小汽车   依赖关系
    public void chase(Car car){
        //获取小汽车的速度
        int carSpeed = car.getSpeed();
        //比较两车的速度
        if (carSpeed < this.speed){//可以追到
            System.out.println("警车开始追击.......");
            int time = 100/(this.speed-carSpeed);
            try {
                Thread.sleep(3000);//编译时异常
            }catch (Exception e){
                e.printStackTrace();
            }

            System.out.println("经过"+time+"后警车追上了超速的小汽车");
        }else {//追不到了
            System.out.println("警车速度追不上小汽车速度");
        }
    }

    //属性--速度
    private int speed;

    //构造方法
    public PoliceCar(){}
    public PoliceCar(int speed){
        this.speed = speed;
    }
}
