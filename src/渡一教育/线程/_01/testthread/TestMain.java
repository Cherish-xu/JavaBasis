package 渡一教育.线程._01.testthread;

public class TestMain {

    public static void main(String[] args) {
        //1.创建一个线程对象
        RunningMan r1 = new RunningMan("苏炳添");
        RunningMan r2 = new RunningMan("博尔特");
        RunningMan r3 = new RunningMan("加特林");
        //2.调用start方法   让线程进入就绪状态
        /*调用start方法是让三个线程同时进入就绪状态，谁先开始由cup决定
        如果依次调用run方法就是，让第一个线程先开始，第一个线程结束后第二个线程再开始
        以此类推
        */
        //1.继承Thread的方法
        //从Thread类中继承过来的
//        r1.start();
//        r2.start();
//        r3.start();

        //2.继承接口的方式
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
    }
}
