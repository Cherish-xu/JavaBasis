package 渡一教育.面向对象进阶.策略模式_内部类.bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
//===========================================================================================
        //一代版本
        /*Toff t = new Toff("土豪");
        bank.profession(t);

        *//*YoungMan ym = new YoungMan("年轻人");
        bank.profession(ym);*//*

        *//*OldMan om = new OldMan("老人家");
        bank.profession(om);//银行欢迎老人家进来办理业务*//*
*/
//===========================================================================================
        //二代改进版本
        Person p = new Toff("土豪");
        bank.profession(p);

        /*Person p = new YoungMan("年轻人");
        bank.profession(p);*/

        /*Person p = new OldMan("老人家");
        bank.profession(p);*/
    }
}
