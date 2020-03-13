package 渡一教育.线程._02;

import java.util.ArrayList;

public class Warehouse {

    //设计单例模式

    //仓库里面的集合   存放元素
    private ArrayList<String> list = new ArrayList<>();

    //向集合中添加元素的方法
    public synchronized void add(){
        if (list.size() < 20) {
            list.add("a");
        }else {
            //return;//类似于break，让方法执行到这里就结束方法
            try {
                this.notifyAll();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //从集合内获取元素的方法
    public synchronized void get() {
        if (list.size() > 0) {
            list.remove(0);
        }else {
            //return;
            try {
                this.notifyAll();
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
