package com.yuanren.core9;

import java.io.*;
import java.util.Properties;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties  properties=new Properties();

        /*properties.put("username","张三丰");
        properties.put("password","123456");
        properties.put("driver","mysql");*/

     /*   File file=new File("JavaFile_16/db.properties");*/
      /*  try {
            FileWriter fileWriter = new FileWriter(file,true);
            properties.store(fileWriter,"sanye");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        try {
           // FileReader fileReader = new FileReader(file);
          //  FileInputStream fileInputStream = new FileInputStream(file);

            InputStream resourceAsStream = PropertiesDemo.class.getResourceAsStream("/db.properties");
            properties.load(resourceAsStream);
            resourceAsStream.close();

            System.out.println(properties.getProperty("username"));
            System.out.println(properties.getProperty("password"));
            System.out.println(properties.getProperty("driver"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
