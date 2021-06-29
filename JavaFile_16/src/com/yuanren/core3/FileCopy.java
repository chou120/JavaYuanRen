package com.yuanren.core3;

import java.io.*;

public class FileCopy {


    public static void main(String[] args) throws IOException {
        File file = new File("D:\\image\\1.jpeg");

        File  file1=new File("img\\美景.jpeg");
        if(!file1.exists()){
            file1.createNewFile();
        }
        byte[] bytes = new byte[(int) file.length()];

        InputStream  inputStream=new FileInputStream(file);
        inputStream.read(bytes);
        inputStream.close();

        OutputStream outputStream=new FileOutputStream(file1);
        outputStream.write(bytes);
        outputStream.close();

        /**
         * 将 User对象写入到user.txt
         *      name   age   address   id
         *
         *      user.txt
         *      张三,25,xxxxx,12
         *      lisi,26,xxxx,13
         *      ....
         *
         * 然后读取  重新塞回user对象中
         *
         *  1.字节流写
         *  2.字符流
         *  3.缓冲流
         *
         */



    }
}
