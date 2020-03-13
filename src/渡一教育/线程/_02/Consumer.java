package 渡一教育.线程._02;

public class Consumer extends Thread {

    private Warehouse house;
    public Consumer(Warehouse house){
        this.house = house;
    }

    //消费者的方法

    @Override
    public void run() {
        while (true){
            house.get();
            System.out.println("消费者消费了一个苹果");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
