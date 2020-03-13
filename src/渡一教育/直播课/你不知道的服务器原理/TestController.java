package 渡一教育.直播课.你不知道的服务器原理;

public class TestController {

    //这个类中的方法是要找的资源
    public void test(){
        //如果想要获取请求传递的信息     通过参数Reqyest

        System.out.println("通过浏览器访问这个方法");
        //可以调用自己写好的业务逻辑     Service业务层      Dao持久层  DB
        //调用以后得到一个结果  字符串  对象   集合  中的数据信息拿出来   拼接成字符串
        //结果响应回浏览器  输出流String
        //

    }
}
