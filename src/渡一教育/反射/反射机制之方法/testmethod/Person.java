package 渡一教育.反射.反射机制之方法.testmethod;

public class Person extends Animal{

    public void eat(){
        System.out.println("Person的吃饭方法");
    }

    public String eat(String s){
        System.out.println("Person带参数的吃饭方法");
        return s;
    }

    private void testPrivate(){
        System.out.println("私有的方法");
    }

}
