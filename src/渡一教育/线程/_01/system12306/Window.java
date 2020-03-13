package 渡一教育.线程._01.system12306;

public class Window extends Thread {
    //窗口的名字
    private String windowName;
    public Window(String windowName){
        this.windowName = windowName;
    }

    @Override
    public void run() {
        this.sellTicket();
    }

    public void sellTicket(){
        while (true){
            System12306 sys = System12306.getInstance();
            Ticket ticket = sys.getTicket();
            if (ticket == null) {
                System.out.println("票卖完了");
                break;
            }
            System.out.println("从"+windowName+"售出一张"+ticket);
        }
    }
}
