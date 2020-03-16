package 渡一教育.线程._03;

/**
 * @Author: 张天旭
 * @Date: 2020/3/16 9:39
 * @Version 1.0
 */
public class ThreadThree extends Thread {

    private ThreadTwo two ;
    public ThreadThree(ThreadTwo two){
        this.two = two;
    }

    public void run() {
        //在two执行的过程中    one在等待的过程中      three将two对象锁定
        System.out.println("thread-three 启动了");
        synchronized (two){
            System.out.println("two 被锁定了");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("two 被释放了");
        }
        System.out.println("thread-three 执行完了");
    }
}
