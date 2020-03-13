package src.渡一教育.Java的IO.homework;

import java.io.*;

public class HomeWork {

    public static void main(String[] args) {
        HomeWork homeWork = new HomeWork();
        File file1 = new File("F://111//111.txt");
        File file2 = new File("F://111//666.txt");
//        f1(file1,file2);
//        f2(file1,file2);
        homeWork.folderCopy(new File("E://软三"),"F://111//222");
    }
    //文件夹复制
    public  void folderCopy(File file,String newPath){
        String oldFilePath = file.getAbsolutePath();
        String newFilePath = newPath+oldFilePath.split(":")[1];
        //创建一个新的file对象
        File newFile = new File(newFilePath);
        //首先判断当前传进来的是文件还是文件夹
        File[] files = file.listFiles();//获取当前传递过来的file对象的所有子元素
        if (files != null){//file是个文件夹
            //通过新的file对象操作在硬盘上创建一个文件夹
            newFile.mkdir();
            System.out.println(newFile.getName()+"文件夹复制完毕");
            if (files != null && files.length != 0){
                for (File f : files){
                    this.folderCopy(f,newPath);
                }
            }
        }else {//file是个文件
            //创建两个文件流，分别读取旧的文件，和写入新的文件
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(file);
                fos = new FileOutputStream(newFile);
                byte[] b = new byte[1024];
                int count = fis.read(b);
                while (count != -1){
                    fos.write(b,0,count);
                    fos.flush();
                    count = fis.read(b);
                }
                System.out.println(newFile.getName()+"文件夹复制完毕");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (fis != null){
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fos != null){
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    }

    //文件的复制
//    public static void f1(File file1,File file2){
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
//        try {
//            fis = new FileInputStream(file1);
//            fos = new FileOutputStream(file2);
//            byte[] b = new byte[5];
//            int count = fis.read(b);
//            while (count != -1){
//                fos.write(b,0,count);
//                count = fis.read(b);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (fis != null){
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (fos != null){
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }


    //文件的加密
//    public static void f2(File file1,File file2){
//        FileInputStream fis = null;
//        FileOutputStream fos = null;
//        try {
//            fis = new FileInputStream(file1);
//            fos = new FileOutputStream(file2);
//            byte[] b = new byte[5];
//
//            int count = fis.read(b);
//            while (count != -1){
//                for (int i = 0;i < b.length-1;i++){
//                    byte temp = b[i];
//                    b[i] = b[i+1];
//                    b[i+1] = b[i];
//                }
//                fos.write(b,0,count);
//                count = fis.read(b);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if (fis != null){
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            if (fos != null){
//                try {
//                    fos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
}
