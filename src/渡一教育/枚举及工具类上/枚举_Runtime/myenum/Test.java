package 渡一教育.枚举及工具类上.枚举_Runtime.myenum;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
       /* MyDay myDay = MyDay.MONDAY;//day类中访问了一个对象
        Day day = Day.monday;*/

        //自己创建的enum还默认继承了Enum   他还间接的继承Object

        /*Day d = Day.valueOf("monday");
        System.out.println(d.name()+"---"+d.ordinal());*/

        /*Day[] days = Day.values();//获取所有枚举对象
        for (Day d:days){
            System.out.println(d.name()+"---"+d.ordinal());
        }*/


        //输入一个字符串Monday     输出对应的信息
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个星期的英文单词：");
        String key = input.nextLine();
        Day day = Day.valueOf(key);//通过输入的英文代词找到了对应的枚举对象
        switch (day){//1.5之前可以使用int char
            case monday:
                System.out.println("您输入的是星期一");
                break;
            case tuesday:
                System.out.println("您输入的是星期二");
                break;
            case wednesday:
                System.out.println("您输入的是星期三");
                break;
            case thursday:
                System.out.println("您输入的是星期四");
                break;
            case friday:
                System.out.println("您输入的是星期五");
                break;
            case saturday:
                System.out.println("您输入的是星期六");
                break;
            case sunday:
                System.out.println("您输入的是星期日");
                break;
            default:
                System.out.println("出现错误");
        }

        System.out.println(Day.monday.getName());
    }
}
