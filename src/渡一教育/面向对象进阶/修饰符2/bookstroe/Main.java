package 渡一教育.面向对象进阶.修饰符2.bookstroe;

import java.beans.BeanInfo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入图书价格");
        float price = sc.nextFloat();
        System.out.println("请输入您的身份，0,1或2");
        int identity = sc.nextInt();
        bookStore.buyBook(price,identity);
    }
}
