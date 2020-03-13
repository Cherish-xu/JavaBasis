package src.渡一教育.send;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;
import java.util.Date;
import java.util.Properties;

public class SendEMail {

    public static void main(String[] args) throws Exception {
        //实现流程有点像Socket

        //0.创建一个props对象     存储一些必要的信息   地址  协议
        Properties props = new Properties();//读取配置文件    继承自Hashtable
        //设置发送邮件的协议
        props.put("mail.transport.protocol","smtp");//必须的
        //设置发送邮件的主机名
        props.put("mail.smtp.host","smtp.qq.com");//必须设置的
        //其他设置的     可以不设置的
        //props.put("mail.smtp.port","465");//设置端口号
        props.put("mail.smtp.auth","true");

        //1.创建一个Session(会话  创建了一个连接)
        Session session = Session.getInstance(props);

        //2.通过session来创建一个transport对象（可以理解为一个输出流    发送）
        Transport ts = session.getTransport();

        //3.ts对象需要通过连接  操作我们的邮箱 发送邮件
        ts.connect("1638630731@qq.com","lggwctwpuqeicggc");

        //4.发送邮件    File---映射---文件（真实硬盘存储的） Message(类似于File)
        MimeMessage message = SendEMail.createMessage(session);
        ts.sendMessage(message,message.getAllRecipients());

        //5.关闭通道
        ts.close();

        //6.简单的输出
        System.out.println("邮件发送完毕");

    }

    //单独设计一个方法  创建一个Message对象
    public static MimeMessage createMessage(Session session) throws Exception {
        //发件人是谁？
        //收件人是谁？
        //设置主题
        //设置时间
        //发送的正文     文字+图片
        //附件
        //创建一个模拟的邮件对象
        MimeMessage message = new MimeMessage(session);
        //设置发件人     参数是InternetAddress类型的
        message.setFrom(new InternetAddress("1638630731@qq.com"));
        //设置收件人
        //不同的身份     收件人--TO     抄送人--CC     密送人--BCC
        message.setRecipient(Message.RecipientType.TO,new InternetAddress("1638630731@qq.com"));
        //设置邮件的主题
        message.setSubject("试一试");
        //设置邮件发送的时间     不写也可以   默认为当前时间
        message.setSentDate(new Date());

//============================================================================================
    /*//邮件的正文
        //纯文本   值发纯文本的
        message.setText("正文");//这一行是正文的纯文字*/
//============================================================================================

    //正文的文字加图片

        //MimeBodyPart

        MimeBodyPart text = new MimeBodyPart();//正文文字部分
        text.setContent("继续努力哦，加油！你是最棒的！！！<br><a href='https://duyi.ke.qq.com'>渡一教育精品课程</a>","text/html;charset=UTF-8");

        MimeBodyPart image = new MimeBodyPart();//正文的图片部分
        image.setDataHandler(new DataHandler((new FileDataSource("E:\\PS作业\\PS作业要求\\广告.jpg"))));
        image.setContentID("广告.jpg");

        //需要一个组合    MimeMultipart   将以上的body部分组合在一起
        MimeMultipart mp1 = new MimeMultipart();
        mp1.addBodyPart(text);//将文本添加进去
        mp1.addBodyPart(image);//将图片添加进去

//============================================================================================

    //将MimeMultipart------>MimeBody
        MimeBodyPart connent = new MimeBodyPart();//转化
        connent.setContent(mp1);

//============================================================================================

    //附件部分
        MimeBodyPart attach1 = new MimeBodyPart();//附件部分
        attach1.setDataHandler(new DataHandler(new FileDataSource("E:\\微信下载文件\\《SSH框架整合实战教程》\\获取更多资源.txt")));

//============================================================================================
    //创建一个容器    将（文字+图片）包装好的和       附件部分    包装起来
        MimeMultipart mp2 = new MimeMultipart();
        mp2.addBodyPart(connent);//所有正文（文字+图片）
        mp2.addBodyPart(attach1);//附件

        //mp2是最大的容器，mp2放在message中
        message.setContent(mp2);

//============================================================================================
    //将上述设置保存起来
        message.saveChanges();
        return message;
    }
}
