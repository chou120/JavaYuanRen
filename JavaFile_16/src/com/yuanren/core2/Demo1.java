package com.yuanren.core2;

import java.io.*;

public class Demo1 {

    public static void main(String[] args) {
        File file = new File("upload/美女.txt");
      /*  if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        OutputStream os=null;
        try {
            //true 表示在后面追加内容
          os=new FileOutputStream(file,true);
          String  str="我在学习";
          os.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert os != null; //断言使用
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

        //读取数据
        try (InputStream inputStream = new FileInputStream(file)) {
            byte[]  bytes=new byte[(int)file.length()];  //存放数据的容器

           /* int  line=inputStream.read();int key=0;
            while(line!=-1){
                bytes[key++]=(byte) line;
                line=inputStream.read();
            }*/

            inputStream.read(bytes);
            String s = new String(bytes);
            System.out.println("---->"+s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
