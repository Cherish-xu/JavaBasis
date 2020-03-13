package src.渡一教育.枚举及工具类下.工具类7_StringBuffer_StringBuilder_Regex.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个字符串");
//        String str = sc.nextLine();

        //第一个字母必须是a，第二个字母是abc中的一个
//        boolean result1 = str.matches("a[abc]");
//        System.out.println(result1);

        //第一个字母必须是a，第二个字母是非abc中的一个
//        boolean result2 = str.matches("a[^abc]");
//        System.out.println(result2);

        //第一个字母必须是a，第二个字母是任意范围中的一个
//        boolean result = str.matches("a[a-zA-Z]");
//        System.out.println(result);

        //a到z都可以但是不能是bc
//        boolean result = str.matches("[a-z&&[^bc]]");
//        System.out.println(result);

        //1.利用Pattern类创建一个模式  理解为一个正则表达式对象
        String srt = "123456aaaa222555ssss654321";
        Pattern pattern = Pattern.compile("\\d{6}");
        //2.需要提供一个字符串
        //3.利用Pattern模式对象创建一个匹配器
        Matcher matcher = pattern.matcher(srt);
        //4.潮汛字符创中出现满足上述格式的字符
        while (matcher.find()   ){
            System.out.println(matcher.group());
        }
    }
}
