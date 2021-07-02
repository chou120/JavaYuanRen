package core4.homework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestCMD {

    public static void main(String[] args) {

        //首先要搞清楚    我们手动输入的是  cmd命令    ls     cp 文件 文件夹    rm 文件或文件夹
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要执行的命令:");
        String  cmd=scanner.nextLine();  //next()  因为 next方法 遇到空格就不再继续往后读取了
        String[] s = cmd.trim().split(" ");
       // System.out.println(Arrays.toString(s));

        List<String>  str=new ArrayList<>();

        List<String> list = Arrays.asList(s);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).equals("")){
                continue;
            }
            str.add(list.get(i).trim());
        }
        try {
           new TestCMD().choose(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void  choose(List<String> list) throws Exception {
        String s = list.get(0);
        switch (s){
            case "ls":
                File[] all = getAll(new File(list.get(1)));
                for (File file : all) {
                    System.out.println(file);
                }
                break;
            case "cp":
                cp(new  File(list.get(1)),new  File(list.get(2)));
                break;
            case "rm":
                deleteFile(new File(list.get(1)));
                break;
            default:
                System.out.println("没有该命令");
                break;
        }


    }


    //ls  cp   rm
    //输入ls 就会显示指定的文件夹下面的所有的文件
    public File[]   getAll(File file){
        return  file.listFiles();
    }


    //输入 cp  进行复制    将指定的文件复制到  指定的文件夹下面
    public   void    cp(File  file,File directory) throws Exception {
        if(!file.isFile()){
            throw  new Exception("输入正确的文件名");
        }
        if(!directory.isDirectory()){
            throw  new Exception("输入正确的文件夹");
        }

        //先读取指定的文件
        FileInputStream  fileInputStream=new FileInputStream(file);
        byte  []bytes=new byte[(int)file.length()];
        fileInputStream.read(bytes);
        fileInputStream.close();

        File file1 = new File(directory, file.getName());
        if(!file1.exists()){
            file1.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file1);
        fileOutputStream.write(bytes);
        fileOutputStream.close();

    }

    //rm   指定的文件     rm  指定的文件夹(如果文件夹下面有文件)

    public  void  deleteFile(File  file){
        if(file.isFile()){
            file.delete();
            return ;
        }
        getAllFile(file);
    }

    //使用递归的方式 获取指定文件夹下面的所有的文件
    public   void   getAllFile(File  file){
            //获取指定文件夹下面的文件然后再删除
        File[] files = file.listFiles();   //如果又是文件夹呢
        for (File file1 : files) {
            if(file1.isFile()){
                file1.delete();
            }else{
                getAllFile(file1);
            }
        }//是为了删除文件夹
        file.delete();
    }
}
