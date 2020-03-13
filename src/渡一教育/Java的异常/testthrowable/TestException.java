package 渡一教育.Java的异常.testthrowable;

public class TestException {

    //设计一个方法    测试自定义异常的使用
    public void testMyException() throws MyException{
        System.out.println("测试自定义异常的方法");
        if (3>2){//肉满足某个条件
            throw new MyException();
        }
    }

    public static void main(String[] args) {


       /* try {
            String str = "null";
            str.length();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }*/
    }
}
