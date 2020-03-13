package 渡一教育.面向对象进阶.修饰符之应用单例模式.singleton;

public class Main {
    public static void main(String[] args) {

        SingleTon s1 = SingleTon.single;
        SingleTon s2 = SingleTon.single;
        System.out.println(s1==s2);//比的是地址
        System.out.println(s1.equals(s2));//比的是对象是否相同   默认比地址
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
