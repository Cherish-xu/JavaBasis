package 渡一教育.反射二刷._02.ioc;

/**
 * @Author: 张天旭
 * @Date: 2020/3/17 15:03
 * @Version 1.0
 */
public class Question {

    //题干
    private String title;
    //答案
    private String answer;

    public Question(String title, String answer) {
        this.title = title;
        this.answer = answer;
    }

    public Question() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "title='" + title + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
