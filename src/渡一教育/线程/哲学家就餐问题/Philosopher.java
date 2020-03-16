package 渡一教育.线程.哲学家就餐问题;

/**
 * @Author: 张天旭
 * @Date: 2020/3/16 10:06
 * @Version 1.0
 */
public class Philosopher extends Thread {

    //哲学家的名字
    private String pname;
    //筷子
    private Chopstick left;
    private Chopstick right;
    private long time;

    public Philosopher(String pname,Chopstick left,Chopstick right,long time){
        this.pname = pname;
        this.left = left;
        this.right = right;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (left){
            System.out.println(this.pname+"拿起了左手边的筷子");
            //锁定右手筷子
            synchronized (right){
                System.out.println(this.pname+"拿起了右手的筷子");
                System.out.println(this.pname+"可以吃饭了");
            }
        }

    }

}
