package 渡一教育.直播课.java爬虫.王者荣耀;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;


/**
 * @Author: 张天旭
 * @Date: 2020/4/8 20:43
 * @Version 1.0
 */
public class TestMain {

    public static void main(String[] args) throws IOException {
        long t1 = System.currentTimeMillis();
        // 1.导包
        // 2.创建连接
        Connection connection = Jsoup.connect("https://pvp.qq.com/web201605/herolist.shtml");
        // 3.通过连接   获取对象    简介的操作网页
        Document document = connection.get();
        // 4.找到存储头像的URL的class
        Element elementUL = document.selectFirst("[class=herolist clearfix]");
        // 5.通过ul找所有的li
        Elements elementLis = elementUL.select("li");
        int size = 0;
        for (Element elementLi : elementLis) {
            // 每次在li中获取一个新的标签
            Element elementA = elementLi.selectFirst("a");
            // 获取a标签的那个href属性
            String hrefURL = elementA.attr("href");
            // 获取a标签的名字（作为图片名字使用）
            String InnerText = elementA.text();
            // 将地址拼接为一个完整的地址（缺少头）
            String path = "https://pvp.qq.com/web201605/" + hrefURL;
            // 通过拼接好的path，创建一个新的连接（模拟一个点击，点击进入后面的大图）
            Connection newConnection = Jsoup.connect(path);
            // 获取一个新的doument对象（大图的）
            Document newDocument = newConnection.get();
            // 找大图的div
            Element div = newDocument.selectFirst("[class=zk-con1 zk-con]");
            // 找到div标签中style的属性
            String backgroundURL = div.attr("style");
            int left = backgroundURL.indexOf("'");
            int right = backgroundURL.lastIndexOf("'");
            String newBg = backgroundURL.substring(left + 1, right);
            String url1 = newBg.substring(0,newBg.length()-5);
            String url2 = url1 + "2.jpg";
            // 得到可以用来下载的URL
//            URL url = new URL("https:" + newBg);
            URL url = new URL("https:" + url2);
            System.out.println("下载(("+InnerText+")),图片路径：-->"+newBg);
            //==============================================================
            // 拿到URL之后需要下载
            // 1.读取图片
            // 通过URL获取一个网络输入流
            InputStream inputStream = url.openStream();
            // 2.写在本地硬盘上
            FileOutputStream fileOutputStream = new FileOutputStream("F://image//" + InnerText + "(2).jpg");
            // 一个流的小数组
            byte[] b = new byte[1024];
            int count = inputStream.read(b);
            while (count != -1) {
                fileOutputStream.write(b, 0, count);
                fileOutputStream.flush();
                count = inputStream.read(b);
            }
            fileOutputStream.close();
            inputStream.close();
            size++;
        }
        long t2 = System.currentTimeMillis();
        System.out.println("全部下载完毕了！！共下载" + size + "张图片，用时"+(t2-t1)+"毫秒。");
    }
}
