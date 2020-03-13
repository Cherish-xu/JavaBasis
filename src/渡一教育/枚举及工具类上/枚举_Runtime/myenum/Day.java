package 渡一教育.枚举及工具类上.枚举_Runtime.myenum;

public enum Day {

    //相当于描述了七个当前类的对象
    //必须在第一行
    monday("星期一",1),tuesday,wednesday,thursday,friday,saturday,sunday;

    //需要给枚举类型提供构造方法
    //并且构造方法必须用private修饰
    private String name;
    private int index;
    private Day(){}
    private Day(String name,int index){
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
