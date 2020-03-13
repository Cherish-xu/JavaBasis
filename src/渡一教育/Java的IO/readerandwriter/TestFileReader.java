package src.渡一教育.Java的IO.readerandwriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestFileReader {

    public static void main(String[] args) {
        //创建字符型的文件输入流
        try {
            File file = new File("F://111//111.txt");
            FileReader fr = new FileReader(file);
            char[] c = new char[1024];
            int count = fr.read(c);
            while (count != -1) {
                System.out.println(new String(c,0,count));
                count = fr.read(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


//        try {
//            FileInputStream fis = new FileInputStream("F://111//111.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }
}
