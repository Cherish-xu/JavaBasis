package 渡一教育.Java的IO.atmproject;

import java.io.Serializable;

public class User implements Serializable {
    //随机生成一个序列化的版本号
    private static final long serialVersionUID = -6698155866130208809L;
    //domain实体对象
    private String aname;
    private String apassword;
    private Float abalance;
    public User(String aname, String apassword, Float abalance) {
        this.aname = aname;
        this.apassword = apassword;
        this.abalance = abalance;
    }
    public User() {
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getApassword() {
        return apassword;
    }
    public void setApassword(String apassword) {
        this.apassword = apassword;
    }
    public Float getAbalance() {
        return abalance;
    }
    public void setAbalance(Float abalance) {
        this.abalance = abalance;
    }
}
