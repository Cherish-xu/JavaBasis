package src.渡一教育.Java的IO.teststream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("F://111//333.txt"));
            byte[] b = {97,98,99,100,101};
            fos.write(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

//        try {
//            //创建一个字节输出流
//            File file = new File("F://111//222.txt");//如果是in，则会报错
//            FileOutputStream fos = new FileOutputStream(file,true);//如果创建的是文件out，文件不在会自动创建一个文件
//            fos.write(99);
//            fos.flush();//刷新，将流管道找那个的字节推入文件中
//            System.out.println("写入完毕");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }
}
