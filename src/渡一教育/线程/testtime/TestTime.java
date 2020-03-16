package 渡一教育.线程.testtime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author: 张天旭
 * @Date: 2020/3/16 11:00
 * @Version 1.0
 */
public class TestTime {

    //设计一个方法    做一个小的恶作剧
    //模拟一个定时器
    //每隔一段时间发送一些数据

    //模拟存储所有人的账号
    private ArrayList<String> userBox = new ArrayList<>();
    //模拟添加手机号
    {
        userBox.add("a");
        userBox.add("b");
        userBox.add("c");
        userBox.add("d");
    }

    public void test() throws ParseException {
        System.out.println("预备~~准备发送垃圾短信");
        //相当于启动了一个小线程  记录时间，每隔一段时间做一些事
        Timer time = new Timer();
        //格式化时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //参数穿进去一个时间的格式，将他变成一个Date类型的
        Date firstTime = sdf.parse("2020-03-16 11:21:00");
        //三个参数 1.要做的事因为TimerTask是抽象的，所以要写成匿名内部类
        //        2.开始的时间
        //        3.每个多长时间执行
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                //循环给集合中的每一个手机号都发送一个消息
                for (int i = 0;i < userBox.size();i++){
                    System.out.println("给"+userBox.get(i)+"发送一条垃圾短信");
                }
                System.out.println("循环了一次了");
            }
        }, firstTime, 3000);
    }

    public static void main(String[] args) {
        try {
            TestTime tt = new TestTime();
            tt.test();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
