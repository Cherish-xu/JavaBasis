package src.渡一教育.枚举及工具类下.考试系统练习.exam;

import java.util.ArrayList;

public class TestMain {

    public static void main(String[] args) {
        //创建考试系统
        ExamMachine machine = new ExamMachine();
        ArrayList<Question> paper = machine.getPaper();

        Student student = new Student("郑中拓");
        student.exam(paper);
        String[] answers = student.exam(paper);


//        Question question = new Question("1.如下哪个选项不是Java基本数据类型？\n\t A.String \n\t B.char \n\t C.int \n\t D.double","A");
//        System.out.println(question.getTitle());
    }
}
