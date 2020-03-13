package 渡一教育.面向对象进阶.缺省适配器模式_多态.test;

public class Main {
    public static void main(String[] args) {
        Object o = new Teacher();
        o.hashCode();
        o.toString();
        Animal a = (Animal)o;
        a.hashCode();
        a.toString();
        a.sleep();
        a.eat();
        System.out.println(a.name);
        System.out.println("-------------------------");
        Person p = (Person)o;
        p.hashCode();
        System.out.println(p.name);
        p.sleep();
        p.eat();
        p.talk();
        System.out.println("-------------------------");
        Teacher t = (Teacher)o;
        System.out.println(t.name);
        t.eat();
        t.sleep();
        t.talk();
        t.teach();

        System.out.println("================================");
        if (o instanceof Person){//判断队形是否属于后面的类型
            System.out.println("lllll");
//            Student s = (Student)o;//运行时异常      造型的时候不能是同级别的类
//            s.study();
        }else {
            System.out.println("类型不匹配");
        }




       /* //1.创建对象
        Person p = new Teacher();
        p.eat();
        p.sleep();
        p.talk();
        //如果想要调用子类独有方法或属性
        //需要将类型还原回真类型   强制类型转化  造型  向上转型    向下转型
        Teacher t = (Teacher)p;
        t.teach();

        //如果父类属性与子类属性重名，执行父类属性
        System.out.println(p.name);

        *//*t.eat();//重写的方法
        t.sleep();//继承的方法
        t.talk();//继承的方法
        t.teach();//老师的独有方法*/


    }
}
