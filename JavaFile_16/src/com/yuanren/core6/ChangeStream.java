package com.yuanren.core6;

import java.io.*;

public class ChangeStream {


    public static void main(String[] args) throws IOException {

        File file = new File("upload/美女.txt");
        OutputStream os=new FileOutputStream(file,true);
        OutputStreamWriter  outputStreamWriter=new OutputStreamWriter(os);
        outputStreamWriter.write("\n我是第一");
        outputStreamWriter.close();
        os.close();

        InputStreamReader  inputStreamReader=new InputStreamReader(new FileInputStream(file));

        inputStreamReader.read();

        //缓冲流比较多


    }

}
