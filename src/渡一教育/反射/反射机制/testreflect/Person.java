package 渡一教育.反射.反射机制.testreflect;

class Person extends Animal {

    private String name;
    public int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
