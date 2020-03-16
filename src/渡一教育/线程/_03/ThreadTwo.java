package 渡一教育.线程._03;

/**
 * @Author: 张天旭
 * @Date: 2020/3/16 8:43
 * @Version 1.0
 */
public class ThreadTwo extends Thread {

    @Override
    public void run() {
        System.out.println("thread-two 启动了");
        ThreadThree three = new ThreadThree(this);
        three.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread-two 执行完了");
    }
}
