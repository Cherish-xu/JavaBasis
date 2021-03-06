package 渡一教育.线程._02;

public class TestMain {

    public static void main(String[] args) {
        Warehouse house = new Warehouse();
        Producer p = new Producer(house);
        //设置线程的优先级别   1-10  数字越大优先级别越高
        p.setPriority(10);
        Consumer c1 = new Consumer(house);
        Consumer c2 = new Consumer(house);
        p.start();
        c1.start();
        c2.start();
    }
}
