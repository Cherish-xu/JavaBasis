package src.渡一教育.Java的IO.testreaderandwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReader {

    public static void main(String[] args) {

        try {
            //创建一个字符型文件输入流
            FileReader fr = new FileReader(new File("F://111//111.txt"));
            int code = fr.read();
            System.out.println(code);
            System.out.println((char)code);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
