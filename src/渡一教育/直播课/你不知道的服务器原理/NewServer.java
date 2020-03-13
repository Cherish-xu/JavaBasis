package 渡一教育.直播课.你不知道的服务器原理;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class NewServer {

    //模拟一个Tomcat容器
    public static void main(String[] args) {
        try {
            //启动一个服务器
            System.out.println("准备启动服务器");
            //1.自己开启一个服务
            ServerSocket server = new ServerSocket(9999);
            System.out.println("服务器已开启，准备接受请求。。。。");
            while (true){
                //2.等待  接收客户端（浏览器）的访问
                Socket socket = server.accept();
                //3.开启一个线程
                new ServerThread().start();
            }












           /* //3.读取客户端（浏览器）发送过来的消息
            //  输入流--读取消息   输出流--写消息
            //  字节型输入流  字节型输出流      带有stream
            //  字符型输入流  字符型输出流      带有reader/writer
            InputStream inputStream = socket.getInputStream();
            //协议        HTTP    超文本传输协议
            //讲socket获取的字节流 -----> 转化为字符流
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            //HTTP请求方式
            //  请求方式 请求资源的名字？参数 协议的版本
            //  名字： 值
            //  名字： 值
            //  名字： 值
            //5.想要每次读取一行    所以将上面的字符流再次包装
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            //6.读取请求的协议
            String value = bufferedReader.readLine();//每一次读取一行
            while (value!=null && !"".equals(value)){//循环读出每一行
                System.out.println(value);
                value = bufferedReader.readLine();//每调用一次读取一行，所以需要再次调用
            }*/









        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
