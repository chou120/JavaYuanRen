package com.yuanren.xml;

import java.io.*;

public class XmlDemo {


    public static void main(String[] args) throws IOException {
        File file = new File("JavaFile_16/Student.xml");
        InputStream inputStream=new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        inputStream.read(bytes);
        inputStream.close();
        String s = new String(bytes);
        System.out.println(s);




    }
}
