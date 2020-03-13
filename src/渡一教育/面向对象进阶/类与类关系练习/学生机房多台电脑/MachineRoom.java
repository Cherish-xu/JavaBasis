package 渡一教育.面向对象进阶.类与类关系练习.学生机房多台电脑;

public class MachineRoom {

    //机房-电脑 聚合关系    机房内有电脑      聚集
    //数组--存放5台电脑    Computer[]
    public Computer[] computers = new Computer[5];//电脑数组;

    //=======================================================================================
    //三选一
    /*//通过构造方法的方式调用方法
    public MachineRoom(){
        this.init();
    }*/

    //通过程序块的方式直接调用方法
    {
        for (int i = 0; i < computers.length; i++){
            computers[i] = new Computer(i+1);
        }
    }

    /*//创建一个方法    用来给电脑数组赋值（初始化）
    public void init(){
        for (int i = 0; i < computers.length; i++){
            computers[i] = new Computer(i+1);
        }
    }*/
    //=======================================================================================

    //机房--学生    依赖关系
    public void welcomeStudent(Student student){
        String studentName = student.getName();
        System.out.println("欢迎"+studentName+"同学进入机房");
        //学生进入机房后挨个寻找一台状态为关闭的电脑
        for (int i = 0; i < computers.length; i++){
            boolean computersState = computers[i].isUsed();//找寻某台电脑，获取其状态
            if (computersState == false){//表示电脑无人使用
                student.useComputer(computers[i]);
                break;
            }
        }

    }
}
