package src.渡一教育.Java的IO.testfile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {

    public static void main(String[] args) {
        File file = new File("F://JavaIOTest//test.txt");
        File[] files = file.listFiles();//获取file子元素的对象
        System.out.println(files);//数组为空，证明当前的file为文件




//        File file = new File("F://JavaIOTest//test.txt");
//        String pname = file.getParent();//获取file父亲的名字
//        File pfile = file.getParentFile();//获取file的父亲对象
//        System.out.println(pname);
//        System.out.println(pfile);
//        System.out.println(pfile.getAbsolutePath());




        //创建一个新的文件夹
//        File file = new File("F://JavaIOTest//Test");
//        boolean value = file.mkdir();//创建一个新的文件夹，不能同时创建多层文件夹
//        System.out.println();
//        boolean values = file.mkdirs();//可以同时创建多层文件夹
//        System.out.println(values);


//        File file = new File("F://JavaIOTest//xyz");//如果路径是没有后缀的，但是调用创建文件夹方法会创建没有后缀的文件
//        try {
//            //创建一个新的文件
//            boolean value = file.createNewFile();//会报异常     返回值为boolean类型表示是否创建成功
//            System.out.println(value);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        File file = new File("F://JavaIOTest//test.txt");
//
//        String path = file.getAbsolutePath();//获取文件的绝对路径
//        String name = file.getName();//获取文件名字
//        System.out.println(path);
//        System.out.println(name);



        //文件本身的属性相关的方法
//        System.out.println(file.canExecute());//
//        System.out.println(file.canRead());//文件是否可以打开
//        System.out.println(file.canWrite());//文件是否可写
//        System.out.println(file.isHidden());//文件是否隐藏
//        System.out.println(file.isFile());//判断当前的file是否是一个文件
//        System.out.println(file.isDirectory());//判断当前的file是否是一个目录（文件夹）
//        long l = file.length();//返回文件字节大小
//        System.out.println(l);
//        long time = file.lastModified();//用来表示获取文件最后修改时间
//        Date date = new Date(time);//转化为格林威治时间
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd KK:mm:ss");//格式化时间
//        System.out.println(sdf.format(date));//用转化过的格式打印时间
//
//        file.setLastModified(time);//修改最后一次修改文件的时间




    }
}
