package src.渡一教育.枚举及工具类下.考试系统练习.exam;

public class Question {
    private String title;
    private String answer;

    public Question(String title, String answer) {
        this.title = title;
        this.answer = answer;
    }

    //重写方法  将默认比较题目对象的地质规划  改成  比较题干

    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj instanceof Question){
            Question anotherQuestion = (Question)obj;
            if (this.title.equals(anotherQuestion.title)){
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.title.hashCode();
    }

    public String getTitle() {
        return title;
    }
    public String getAnswer() {
        return answer;
    }
}
