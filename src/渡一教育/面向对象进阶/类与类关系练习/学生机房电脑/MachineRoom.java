package 渡一教育.面向对象进阶.类与类关系练习.学生机房电脑;

public class MachineRoom {

    //机房-电脑 聚合关系    机房内有电脑
    //数组--存放5台电脑    Computer[]
    public Computer computer = new Computer(1);

    //机房--学生    依赖关系
    public void welcomeStudent(Student student){
        String studentName = student.getName();
        System.out.println("欢迎"+studentName+"同学进入机房");
        //学生进入机房后是用电脑
        student.useComputer(computer);
    }
}
