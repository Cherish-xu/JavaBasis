package src.渡一教育.枚举及工具类下.考试系统练习.exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class ExamMachine {
    private HashMap<String,String> userBox = new HashMap<String,String>();
    {
        userBox.put("郑中拓","123");
        userBox.put("渡一教育","666");
        userBox.put("java","888");
    }


    //属性--题库
    //Set集合
    private HashSet<Question> questionBank = new HashSet<>();

    {
        questionBank.add(new Question("以下选项哪个是Java基本数据类型?\n\tA.String\n\tB.Integer\n\tC.boolean\n\tD.Math","C"));
        questionBank.add(new Question("以下选项哪个不是Java基本数据类型?\n\tA.String\n\tB.int\n\tC.boolean\n\tD.double","A"));
        questionBank.add(new Question("以下选项哪个是Java引用数据类型?\n\tA.String\n\tB.int\n\tC.boolean\n\tD.char","A"));
        questionBank.add(new Question("以下选项哪个不是Java引用数据类型?\n\tA.String\n\tB.Integer\n\tC.boolean\n\tD.Math","C"));
        questionBank.add(new Question("以下选项哪个是java.util包中的类?\n\tA.String\n\tB.Integer\n\tC.Scanner\n\tD.Math","C"));
        questionBank.add(new Question("以下选项哪个不是java.util包中的类?\n\tA.Date\n\tB.Integer\n\tC.Calendar\n\tD.Random","B"));
        questionBank.add(new Question("以下选项哪个不是String类中的方法?\n\tA.compareTo\n\tB.append\n\tC.substring\n\tD.concat","B"));
        questionBank.add(new Question("以下选项哪个是String类中方法?\n\tA.append\n\tB.delete\n\tC.insert\n\tD.concat","D"));
        questionBank.add(new Question("以下选项哪个不是接口中属性的修饰符?\n\tA.public\n\tB.static\n\tC.final\n\tD.abstract","D"));
        questionBank.add(new Question("以下选项哪个不是Set集合的方法?\n\tA.set\n\tB.add\n\tC.remove\n\tD.iterator","A"));
    }

    //设计一个方法    随机生成试卷
    public ArrayList<Question> getPaper(){
        HashSet<Question> paper = new HashSet<>();
        //产生一个随机的序号 去寻找题目
        ArrayList<Question> questionBank = new ArrayList<Question>(this.questionBank);
        //随机抽提
        int index = new Random().nextInt(this.questionBank.size());
        while (paper.size() != 5) {
            Question question = questionBank.get(index);
            paper.add(question);
        }
        return new ArrayList<Question>(paper);
    }
}
