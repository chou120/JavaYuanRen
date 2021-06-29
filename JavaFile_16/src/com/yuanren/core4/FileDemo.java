package com.yuanren.core4;

import java.io.*;

public class FileDemo {

    //字节缓冲流
    public static void main(String[] args) {

        File file =new File("upload/美女.txt");

        InputStream   inputStream= null;
        BufferedInputStream  bufferedInputStream=null;
        try {
            inputStream = new FileInputStream(file);
            bufferedInputStream=new BufferedInputStream(inputStream);

            byte[] bytes = new byte[(int) file.length()];
            bufferedInputStream.read(bytes);
            String s = new String(bytes);
            System.out.println(s);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedInputStream.close();
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        //自己尝试写 BufferOutputStream


    }

}
