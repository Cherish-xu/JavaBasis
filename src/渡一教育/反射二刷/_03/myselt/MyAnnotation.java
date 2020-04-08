package 渡一教育.反射二刷._03.myselt;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: 张天旭
 * @Date: 2020/3/18 9:24
 * @Version 1.0
 */

// 说明这个注解可以写在那些位置
@Target({ElementType.FIELD,ElementType.PARAMETER,ElementType.METHOD})
// 描述这个注解存在什么作用域中
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {

    //描述属性
    public static final String test = "zzt";

    //可以描述方法        注解方法要求必须有返回值
    public abstract int test();
}
