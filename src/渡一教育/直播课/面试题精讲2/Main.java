package 渡一教育.直播课.面试题精讲2;


//第一题
public class Main {
    /**
     * 私有静态的方法
     *      私有类
     *      静态修饰符
     *      ((Main)null).testMethod();---先将null当做对象转型成Main类型，之后再调用方法
     */

    private static void testMethod(){
        System.out.println("testMethod");
    }

    public static void main(String[] args) {
        ((Main)null).testMethod();
    }
}
