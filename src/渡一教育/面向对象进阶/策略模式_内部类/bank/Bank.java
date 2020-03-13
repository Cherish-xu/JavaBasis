package 渡一教育.面向对象进阶.策略模式_内部类.bank;

public class Bank {
    //====================================================================================
    //一代版本
    /*//银行开门  等待客户进来办理业务
    public void profession(OldMan om){
        System.out.println(om.getName()+"客户进入银行了");
        om.callNumber();
        om.transact();
        om.leave();
    }

    //银行开门  等待客户进来办理业务
    public void profession(YoungMan ym){
        System.out.println(ym.getName()+"客户进入银行了");
        ym.callNumber();
        ym.transact();
        ym.leave();
    }

    //银行开门  等待客户进来办理业务
    public void profession(Toff t){
        System.out.println(t.getName()+"客户进入银行了");
        t.callNumber();
        t.transact();
        t.leave();
    }*/
    //====================================================================================
    //二代改进版本
    //银行开门  等待客户进来办理业务
    public void profession(Person person){
        System.out.println(person.getName()+"客户进入银行了");
        person.callNumber();
        person.transact();
        person.leave();
    }
}
