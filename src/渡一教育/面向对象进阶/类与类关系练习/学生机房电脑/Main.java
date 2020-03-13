package 渡一教育.面向对象进阶.类与类关系练习.学生机房电脑;

public class Main {
    public static void main(String[] args) {
        MachineRoom machineRoom = new MachineRoom();
        Student student = new Student("张天旭");
        machineRoom.welcomeStudent(student);

    }
}
