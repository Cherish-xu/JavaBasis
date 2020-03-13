package 渡一教育.面向对象进阶.类与类关系练习.警车追击问题;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(22);
        Velometer velometer = new Velometer(5);
        velometer.measureCar(car);
    }
}
