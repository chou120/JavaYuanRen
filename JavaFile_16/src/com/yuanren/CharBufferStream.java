package com.yuanren;

import java.io.*;

public class CharBufferStream {
    public static void main(String[] args) throws IOException {

        File file = new File("upload/美女.txt");
        /*Writer  writer=new FileWriter(file,true);
        BufferedWriter  bufferedWriter=new BufferedWriter(writer);
        bufferedWriter.write("张三,34,家中有屋又有田,123");
        bufferedWriter.newLine();
        bufferedWriter.write("哈撒发");
        bufferedWriter.flush();*/

        Reader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s = bufferedReader.readLine();
        while (s != null) {
            System.out.println(s);
            s = bufferedReader.readLine();
        }

    }
}
