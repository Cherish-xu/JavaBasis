package src.渡一教育.Java的IO.newtestfile;

public class TestMethod {

    public void testOne(){
        this.testTwo();
        System.out.println("我是testOne方法");
    }
    public void testTwo(){
        this.testThree();
        System.out.println("我是testTwo方法");
    }
    public void testThree(){
        System.out.println("我是testThree方法");
    }

    public static void main(String[] args) {
        TestMethod tm = new TestMethod();
        tm.testOne();
    }
}
