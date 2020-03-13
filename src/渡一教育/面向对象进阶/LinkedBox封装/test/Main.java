package 渡一教育.面向对象进阶.LinkedBox封装.test;

import 渡一教育.面向对象进阶.LinkedBox封装.util.ArrayBox;
import 渡一教育.面向对象进阶.LinkedBox封装.util.LinkedBox;

public class Main {
    public static void main(String[] args) {
        ArrayBox ab = new ArrayBox();
        ab.add(10);
        ab.remove(0);
        ab.get(0);
        ab.size();

        LinkedBox lb = new LinkedBox();
        lb.add(10);
        lb.get(0);
        lb.remove(0);
        lb.size();
    }
}
