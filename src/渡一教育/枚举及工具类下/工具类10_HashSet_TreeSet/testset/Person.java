package src.渡一教育.枚举及工具类下.工具类10_HashSet_TreeSet.testset;

public class Person {
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    //重写equals方法
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Person){
            //obj还原为Person类型
            Person anotherPerson = (Person)obj;
            //this anotherPerson比较队形中的name属性
            if (this.name.equals(anotherPerson)){
                return true;
            }
        }
        return false;
    }

    //重写hashcodefangf
    public int hashCode(){
        //两个person对象name属性一致    需要让hashCode返回值一致
        return this.name.hashCode();
    }
}
