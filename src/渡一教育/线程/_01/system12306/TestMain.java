package 渡一教育.线程._01.system12306;

public class TestMain {

    public static void main(String[] args) {
        Window w1 = new Window("北京西站");
        Window w2 = new Window("北京南站");
        Window w3 = new Window("北京站");
        w1.start();
        w2.start();
        w3.start();
    }
}
