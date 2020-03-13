package 渡一教育.枚举及工具类上.枚举_Runtime.myenum;

public class MyDay {//描述星期

    //类似单例模式
    //构造方法私有
    private MyDay(){}
    //所有对象都是属性  final==不可更改     static==可以通过类名访问
    public static final MyDay MONDAY = new MyDay();
    public static final MyDay TUESDAY = new MyDay();
    public static final MyDay WEDNESDAY = new MyDay();
    public static final MyDay THURSDAY = new MyDay();
    public static final MyDay FIRDAY = new MyDay();
    public static final MyDay SATURDAY = new MyDay();
    public static final MyDay SUNDAY = new MyDay();
}
