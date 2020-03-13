package 渡一教育.反射.反射机制之方法.ioc;

public class Main {

    public static void main(String[] args) {
        //创建一个Question类型的对象     将对象的控制权交由别人处理
        MySpring spring = new MySpring();
        /*Question question = (Question) spring.getBean("渡一教育.反射.反射机制之方法.ioc.Question");
        System.out.println(question);*/


        Person person = (Person)spring.getBean("渡一教育.反射.反射机制之方法.ioc.Person");
        System.out.println(person);

    }
}
