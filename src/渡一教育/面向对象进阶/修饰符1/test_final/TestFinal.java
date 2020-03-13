package 渡一教育.面向对象进阶.修饰符1.test_final;

public class TestFinal {

    private final String naem = "";//属性如果用final修饰，则必须赋初值，否则编译报错，因为属性是有默认值的，如果不负初值则无法使用没有意义

    public void testNum(final int a){
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.eat();





        /*TestFinal tf = new TestFinal();
        tf.testNum(1);//调用的第一个方法
        tf.testNum(2);//属于另外一个方法，调用的第二个方法*/

        /*//基本类型变量
        final int a;//声明变量  在栈内存中开启空间无默认值
        a = 1;//所以需要给一次机会赋值*/

       /* //引用类型变量
        final int[] x;
        x = new int[]{1,2,3};
        //x = new int[5];//x不可改变
        x[0] = 10;//可以改变元素的值
        x[1] = 100;*/
    }
}
