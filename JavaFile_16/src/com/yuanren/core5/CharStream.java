package com.yuanren.core5;

import java.io.*;

public class CharStream {


    public static void main(String[] args) {
        File  file=new File("upload/美女.txt");
       /* Writer writer=null;
        try {
            writer = new FileWriter(file,true);
            writer.write("张三丰没有疯");
            writer.write("\n");
            writer.write("钱三强没有钱");
            writer.write("\n");
            writer.flush();

            writer.write("我是你吗");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (writer != null) {
                try {
                    writer.close();  // Stream closed
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        try {
            writer.write("张三丰");
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        Reader  reader=null;
        try {
            reader   =new FileReader(file);
            char [] ch=new char[(int)file.length()];  //注意:如果文件中所有的数据都是汉字类型的包括符号,你可以使用这种方式
            /*reader.read(ch);
            String s = new String(ch);
            System.out.println(s);
            */

            int read = reader.read();
            int key=0;
            while(read!=-1){
                ch[key++]=(char)read;
                read = reader.read();
            }
            String s = new String(ch,0, key);
            System.out.println(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
