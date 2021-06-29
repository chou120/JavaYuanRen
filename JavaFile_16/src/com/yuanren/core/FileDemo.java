package com.yuanren.core;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) {
        /*File file = new File("img/20170217212148665.png");
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file.getParentFile());
        System.out.println(file.getName());
        System.out.println(file.isDirectory());
        System.out.println(file.length());  //文件内容大小


        System.out.println( file.renameTo(new File("hahah.png")));*/

        File file = new File("D:\\JavaYuanRen\\JavaYuanRen");
        /*if(!file.exists()){
            file.mkdir();
        }*/
        /*
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
*/

        /*String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }*/

       /* File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }*/
        
        //找到文件夹下面的所有的md文件
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".md");
            }
        });
        for (File file1 : files) {
            System.out.println(file1);
        }

    }
}
