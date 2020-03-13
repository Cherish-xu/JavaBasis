package 渡一教育.线程._02;

public class Producer extends Thread{

    //为了保证生产者和消费者使用同一个仓库对象，添加一个属性
    private Warehouse house;
    public Producer(Warehouse house){
        this.house = house;
    }

    //生产者的run方法----一直向仓库添加元素
    @Override
    public void run() {
        while (true){
            house.add();
            System.out.println("生产者生产一个苹果");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
