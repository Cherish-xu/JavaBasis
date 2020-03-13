package 渡一教育.直播课.Socket没有那么神奇.Server;

import com.sun.corba.se.spi.activation.Server;
import com.sun.org.apache.bcel.internal.generic.BIPUSH;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
    public static void main(String[] args) throws IOException {
        //1.创建一个自己的服务（模拟开启一个服务）
        //报错可能原因
        //异常（编译时异常）
        //抽象类   接口（没有对象产生）
        //构造方法私有    为参数构造方法已经被覆盖
        System.out.println("开启服务器");
        Socket socket = null;
        PrintWriter printWriter = null;
        try {
            ServerSocket server = new ServerSocket(9999);//int0-65535
            //2.等待客户端访问     如果有人访问得到一个对象
            socket = server.accept();

            System.out.println("有连接");

            //===============================================================
            //联通了   与客户端互动  (字符串    中文)
            //流对象（输入流--读取       输出流--写）
            //字节型输入流   字符型输出流
            //字符型输入流   字节型输出流
            //字节--8bit  字符--2字节--16bit
            OutputStream outputStream = socket.getOutputStream();//字节型输出流
            //因为获取的输出流是字节型的 发送中文不方便 转化成字符形式（包装）
            //带Stream--字节
            //带Write、reader--字符


            // 发送一句话
            //        //两种方式
            printWriter = new PrintWriter(outputStream);
            printWriter.println("发送一句话");//写入到流管道中

            //刷新
            printWriter.flush();

            //服务器接受消息
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String value = bufferedReader.readLine();
            System.out.println(value);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭    放在Finally中
            printWriter.close();
        }







        /*//模拟服务器 用浏览器访问
        ServerSocket server1 = new ServerSocket(9999);
        Socket socket1 = server1.accept();//客户端（浏览器）连接
        //读取浏览器发送过来的请求协议HTTP
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(new Socket().getInputStream()));
        String value1 = bufferedReader1.readLine();
        while (value!=null&&!"".equals((value))){
            System.out.println(value);
            value = bufferedReader.readLine();
        }*/

    }
}
