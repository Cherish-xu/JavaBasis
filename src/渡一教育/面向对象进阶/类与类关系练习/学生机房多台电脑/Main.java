package 渡一教育.面向对象进阶.类与类关系练习.学生机房多台电脑;

public class Main {
    public static void main(String[] args) {
        MachineRoom machineRoom = new MachineRoom();
        Student student = new Student("张天旭");
        machineRoom.welcomeStudent(student);
        Student student1 = new Student("刘昭");
        machineRoom.welcomeStudent(student1);
        Student student2 = new Student("顾群");
        machineRoom.welcomeStudent(student2);
        Student student3 = new Student("马维俊");
        machineRoom.welcomeStudent(student3);

    }
}
