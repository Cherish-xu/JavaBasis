package src.渡一教育.枚举及工具类下.考试系统练习.exam;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String username;

    public Student(String username) {
        this.username = username;
    }

    //学生需要考试--方法
    public String[] exam(ArrayList<Question> paper){
        Scanner sc = new Scanner(System.in);
        String[] answers = new String[paper.size()];
        for (int i = 0;i < paper.size();i++){
            Question question = paper.get(i);
            System.out.println(question.getTitle());
            System.out.println("请输入正确的答案");
            answers[i] = sc.nextLine();
        }
        return answers;
    }
}
