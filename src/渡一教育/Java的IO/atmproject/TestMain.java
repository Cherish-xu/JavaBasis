package 渡一教育.Java的IO.atmproject;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Test t = new Test();
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎进入张氏银行自助服务系统");
        System.out.println("请输入您的账号");
        String name = input.nextLine();
        System.out.println("请输入您的密码");
        String password = input.nextLine();
        String loginResult = t.login(name,password);
        System.out.println(loginResult);
    }
}
