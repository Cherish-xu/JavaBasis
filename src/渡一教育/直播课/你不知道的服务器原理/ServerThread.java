package 渡一教育.直播课.你不知道的服务器原理;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.Socket;

public class ServerThread extends Thread {

    //属性
    private Socket socket;
    public ServerThread serverThread;


    @Override
    public void run() {
        try {
            //3.读取客户端（浏览器）发送过来的消息
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
            }
            //7.解析  GET 资源？
            String[] values = value.split(" ");
            System.out.println(values[0]);//请求的方式
            System.out.println(values[1]);//请求的名字和参数
            System.out.println(values[2]);//协议版本
            //8.根据请求的名字寻找一个资源（文件（静态）+操作（动态））
            String[] nameAndParams = values[1].split("\\?");
            /*System.out.println(nameAndParams[0]);//请求的名字
            System.out.println(nameAndParams[1]);//请求的携带参数*/

            //请求名字      test-->TestController类中的test方法
            String name = nameAndParams[0].substring(1);

            /*//如果用反射
            Class clazz = Class.forName("包名.类名");
            //通过类zhaofangf
            Method method = clazz.getMethod("方法名",参数);
            //方法执行
            method.invoke(obj,参数);*/

            if (name.equals("test")){
                new TestController().test();
            }else {
                System.out.println("404");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
