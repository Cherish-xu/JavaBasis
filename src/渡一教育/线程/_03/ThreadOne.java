package 渡一教育.线程._03;

/**
 * @Author: 张天旭
 * @Date: 2020/3/16 8:43
 * @Version 1.0
 */
public class ThreadOne extends Thread {

    @Override
    public void run() {
        System.out.println("thread-one 启动了");
        ThreadTwo two = new ThreadTwo();
        two.start();
        //线程2箱加入到线程1里面   谁加入谁调用join方法
        try {
            two.join(2000);
            //重载的join方法     two.jion(2000)    表示线程1会等待2000毫秒的时间等着线程2执行，如果超过2000毫秒线程2还未执行完，线程1 就执行不在等待
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("thread-ont 执行完了");
    }
}
