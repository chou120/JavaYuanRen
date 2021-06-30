package com.yuanren.xml;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.HTMLWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateHtml {

    public static void main(String[] args) {
        File file = new File("beautyGirl.html");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Document document = DocumentHelper.createDocument();
        Element html = document.addElement("html").addAttribute("lang", "en");
        Element head = html.addElement("head");
        head.addElement("meta").addAttribute("charset", "UTF-8");
        head.addElement("title").setText("你好,妹子!!!");
        Element body = html.addElement("body");

        String background = "background-image: url('img/美景.jpeg');border: 1px sold red;width:400px;height: 300px;opacity: 0.2";
        Element table = body.addElement("table").addAttribute("style", background);
        Element th = table.addElement("th");
        th.addElement("td").setText("姓名");
        th.addElement("td").setText("年龄");
        th.addElement("td").setText("地址");
        th.addElement("td").setText("联系方式");

        Element tr = table.addElement("tr");
        tr.addElement("td").setText("张三");
        tr.addElement("td").setText("22");
        tr.addElement("td").setText("栖霞区");
        tr.addElement("td").setText("12345678901");

        HTMLWriter  htmlWriter= null;
        try {

            htmlWriter = new HTMLWriter(new FileOutputStream(file));
            htmlWriter.write(document);

            htmlWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
