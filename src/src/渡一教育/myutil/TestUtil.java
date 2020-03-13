package src.渡一教育.myutil;

public class TestUtil  {

    public static void main(String[] args) {
        /*//java.lang 包       不需要通过import导包
        int value = Integer.parseInt("123");//将字符串转换为数字*/
        Integer i1 = 10;
        Integer i2 = 10;
        Integer i3 = new Integer(10);
        Integer i4 = new Integer(10);
        //这里的 == 比较比的是引用类型空间的地址
        System.out.println(i1 == i2);//ture     如果变量的值超过127的换会重新创建一个    变为false
        System.out.println(i1 == i3);//false
        System.out.println(i3 == i4);//false
        //这里的equals方法是重写后的方法    比较的是空间内的值
        System.out.println(i1.equals(i2));//ture
        System.out.println(i1.equals(i3));//ture
        System.out.println(i3.equals(i4));//ture

    }
}
