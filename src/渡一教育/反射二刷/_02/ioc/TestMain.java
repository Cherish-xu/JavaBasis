package 渡一教育.反射二刷._02.ioc;

/**
 * @Author: 张天旭
 * @Date: 2020/3/17 15:04
 * @Version 1.0
 */
public class TestMain {

    public static void main(String[] args) {
        //创建一个Question对象    将对象的控制权交由别人处理   IOC
        MySpring spring = new MySpring();

        Persion persion = (Persion) spring.getBean("渡一教育.反射二刷._02.ioc.Persion");
        System.out.println(persion);

//        Question question = (Question) spring.getBean("渡一教育.反射二刷._02.ioc.Question");
//        System.out.println(question);

    }
}
