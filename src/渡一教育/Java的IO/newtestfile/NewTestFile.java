package src.渡一教育.Java的IO.newtestfile;

import java.io.File;

public class NewTestFile {

    public static void main(String[] args) {
        NewTestFile newTestFile = new NewTestFile();
        File file = new File("F:\\JavaIOTest");
        //newTestFile.showFile(file);
        newTestFile.deleteFie(file);
    }

    //设计一个方法    用来遍历文件夹
    public void showFile(File file){
        //判断如果file是一个文件夹    并且文件夹有元素    向下递归
        if (file.listFiles() != null &&file.listFiles().length != 0){//证明是一个带元素的文件夹
            for (File f: file.listFiles()){//将每一个子元素都遍历一遍
                this.showFile(f);
            }
        }
        //当file是文件或是空的文件夹   显示   打印
        System.out.println(file.getAbsolutePath());
    }

    //设计一个方法    删除文件夹
    public void deleteFie(File file){
        if (file.listFiles() != null && file.listFiles().length != 0){
            for (File f:file.listFiles()){
                this.deleteFie(f);
            }
        }

        //删除文件（当file是个文件或者是个空文件夹）
        file.delete();
    }
}
