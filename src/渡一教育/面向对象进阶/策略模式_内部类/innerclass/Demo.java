package 渡一教育.面向对象进阶.策略模式_内部类.innerclass;

public class Demo {
    private String name = "正常类中的属性";
    public void testDemo(){
        System.out.println("正常类中的方法");
    }

    public void testDemoOne(){
        String s = "";
        //定义一个局部内部类
        class InnerTestOneMethod{
            //局部内部类中使用的局部变量都需要家final修饰
        }
    }

    public void testDemoTwo(){
        String s = "abc";
        //定义一个局部内部类     名字与上一个局部内部类重名
        class InnerTestOneMethod{

            String xxx = s;
            String yyy = s;
        }
    }

    public class InnerDemo{
        public String name = "内部类中的属性";
        public void testInnerDemo(){
            System.out.println("成员内部类的成员+"+Demo.this.name);
            Demo.this.testDemo();//在内部类中可以调用外部类的成员的，包括私有的
        }
    }

    //静态内部类
    public static class InnerDemoStatic{
        public static void test(){
            System.out.println("静态成员内部类");
        }

    }

    //匿名内部类
    public interface Test{
        public void test();
    }

    public static void main(String[] args) {
        Test t = new Test(){
            public void test(){
                System.out.println("匿名内部类");
            }
        };
        t.test();
    }
}
