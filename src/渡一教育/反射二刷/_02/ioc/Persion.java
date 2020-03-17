package 渡一教育.反射二刷._02.ioc;

/**
 * @Author: 张天旭
 * @Date: 2020/3/17 15:06
 * @Version 1.0
 */
public class Persion {

    private String name;
    private String sex;
    private Integer age;

    public Persion() {
    }

    public Persion(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
