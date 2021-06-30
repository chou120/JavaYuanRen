package com.yuanren.xml;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class CreateXml {

    public static void main(String[] args) {
        File file = new File("bySelf.xml");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //创建一个文档对象
        Document  document= DocumentHelper.createDocument();
        Element root = document.addElement("root");   //第一个添加的是根元素
        Element student = root.addElement("student");
        student.addElement("name").setText("张2三");
        student.addElement("age").setText("122222");
        student.addElement("address").setText("哈哈试试");

          //第一个添加的是根元素
        student = root.addElement("student");
        student.addElement("name").setText("张三2");
        student.addElement("age").setText("123");
        student.addElement("address").setText("哈哈试4试");

        //以默认的格式写入xml中
        OutputFormat    outputFormat=OutputFormat.createCompactFormat();  //默认

        XMLWriter   xmlWriter= null;
        try {
            //写入xml文件的一个工具类
            xmlWriter = new XMLWriter(new FileOutputStream(file,true),outputFormat);
            xmlWriter.write(document);
            xmlWriter.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
