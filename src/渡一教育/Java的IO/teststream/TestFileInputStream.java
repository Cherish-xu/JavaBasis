package src.渡一教育.Java的IO.teststream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(new File("F:\\111\\111.txt"));
            long v = fis.skip(5);//跳过几个字节读取     小用处:利用几个线程同时读取文件，分工读取
            System.out.println(v);
            int code = fis.read();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


//        try {
//            FileInputStream fis = new FileInputStream("F:\\111\\111.txt");
//            int v = fis.available();//表示流管道中有多少缓存的字节
//            System.out.println(v);
//            //创建一个空的数组
//            byte[] b = new byte[5];
//
//            int count = fis.read(b);//取文件读取，装入数组中  返回值表示读取到的有效字节个数
//            while (count != -1){
//                String value = new String(b,0,count);
//                System.out.print(value);
//                count = fis.read(b);
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try {
//            //创建一个字节型的文件输入流     读取一个文件的内容
//            File file = new File("F:\\111\\111.txt");
//            FileInputStream fis = new FileInputStream(file);
//
//            int i = fis.read();//每次读取一个字节
//            while (i != -1) {
//                System.out.println(i);//读取的字节对应的Unicode码
//                i = fis.read();
//            }
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
