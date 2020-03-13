package src.渡一教育.Java的IO.testbuffered;

import java.io.*;

public class TestBufferedStream {

    public static void main(String[] args) {

        try {
            //创建一个流
            File file = new File("F://111//111.txt");
            FileInputStream fis = new FileInputStream(file);
            //缓冲流
            BufferedInputStream bis = new BufferedInputStream(fis);
            bis.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
