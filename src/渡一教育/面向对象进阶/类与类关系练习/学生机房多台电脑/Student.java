package 渡一教育.面向对象进阶.类与类关系练习.学生机房多台电脑;

public class Student {

    //属性--学生的名字
    private String name;

    //属性--学生的素质（关不关电脑）  随机0-9的整数    0-4人品好  5-9人品不好
    private int RP = (int)(Math.random()*10);

    //构造方法
    public Student(){}
    public Student(String name){
        this.name = name;
    }

    //设计一个获取学生姓名的方法（因为学生的权限是私有的）
    public String getName(){
        return this.name;
    }

    //依赖关系  学生使用电脑
    public void useComputer(Computer computer){
        System.out.println(this.name+"开始使用电脑了");
        computer.beOpen();
        computer.beUsing();
        if (this.RP < 5) {
            computer.beClose();
        } else {
            System.out.println(this.name + "人品有问题，不关电脑");
        }
    }
}
