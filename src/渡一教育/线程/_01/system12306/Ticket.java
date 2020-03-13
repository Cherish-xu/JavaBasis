package 渡一教育.线程._01.system12306;

public class Ticket {

    /*
    为什么用Float而不用float？
    以后从数据库中读取数据可能为null，而基本类型float不能存储null，
    之后的domain实体对象要写基本类型对应的包装类
    * */

    private String start;//始发站
    private String end;//终点站
    private Float price;//票价

    public Ticket(){}

    public Ticket(String start, String end, Float price) {
        this.start = start;
        this.end = end;
        this.price = price;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return start+"-->"+end+"     票价："+price;
    }
}
