package 渡一教育.面向对象进阶.修饰符1.packb;

import 渡一教育.面向对象进阶.修饰符1.packa.TestA;

public class TestB extends TestA {

    public void testB(){
        this.testPublic();
        this.testProtected();
    }

    public static void main(String[] args) {
        //TestB tb = new TestB();
        //tb.testPublic();
        //tb.testProtected();

        TestA ta = new TestA();
        ta.testPublic();
    }
}
