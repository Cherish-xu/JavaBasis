package 渡一教育.反射二刷._03.testannotation;

import java.util.Date;

/**
 * @Author: 张天旭
 * @Date: 2020/3/17 19:45
 * @Version 1.0
 */
public class TestAnnotation {

    public static void main(String[] args) {
        //当前系统的时间
        Date date = new Date();
        //已废弃的    @Deprecated
        date.getYear();
    }
}
