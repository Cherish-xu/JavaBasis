package 渡一教育.枚举及工具类上.枚举_Runtime.gc;

public class Main {

    public static void main(String[] args) {
        /*Person p = new Person();

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        p = null;
        System.gc();*/

        //没有办法new的可能
        // 1.抽象类/接口    2.没有无参的构造方法     3.构造方法私有
        //私有构造方法
        Runtime r = Runtime.getRuntime();
        long max = r.maxMemory();//最大内存
        long total = r.totalMemory();//可用的内存
        long free = r.freeMemory();//空闲的内存
        System.out.println(max/1024/1024);
        System.out.println(total/1024/1024);
        System.out.println(free/1024/1024);
        System.out.println("------------------------------");
        byte[] b = new byte[10000000];
        long max2 = r.maxMemory();//最大内存
        long total2 = r.totalMemory();//可用的内存
        long free2 = r.freeMemory();//空闲的内存
        System.out.println(max2/1024/1024);
        System.out.println(total2/1024/1024);
        System.out.println(free2/1024/1024);

    }
}
