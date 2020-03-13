package 渡一教育.面向对象进阶.修饰符1.packa;

public class TestA {

    //主方法
    public static void main(String[] args) {
        TestA ta = new TestA();
        ta.testPublic();
        ta.testProtected();
        ta.testDefault();
        ta.testPrivate();
    }

    public void testPublic(){
        System.out.println("public 修饰方法");
    }
    protected void testProtected(){
        System.out.println("protected 修饰方法");
    }
    void testDefault(){
        System.out.println("默认不写的 修饰方法");
    }
    private void testPrivate(){
        System.out.println("private 修饰方法");
    }


}
