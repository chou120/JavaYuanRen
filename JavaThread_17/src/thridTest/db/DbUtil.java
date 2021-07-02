package thridTest.db;

import com.alibaba.fastjson.JSONObject;
import thridTest.pojo.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DbUtil {
    private static List<User> userList = new ArrayList<>();
    private static List<Post>  postList= new ArrayList<>();
    private static List<Type> typeList = new ArrayList<>();
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static File userFile = new File("JavaThread_17/user.json");
    private static File postFile = new File("JavaThread_17/post.json");
    private static File typeFile = new File("JavaThread_17/type.json");


    public  static void  writerJson(Post post){
        try (OutputStream outputStream = new FileOutputStream(postFile)) {
            postList.add(post);
            String s = JSONObject.toJSONString(postList);
            outputStream.write(s.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
   /* static {
        //先写进入
        try (OutputStream outputStream = new FileOutputStream(userFile)) {
            for (int i = 0; i < 5; i++) {
                String format = simpleDateFormat.format(new Date());
                Date parse = simpleDateFormat.parse(format);
                userList.add(new User(9520 + i, "张三" + i, "12345" + i, parse));
            }
            String s = JSONObject.toJSONString(userList);
            outputStream.write(s.getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try (OutputStream outputStream = new FileOutputStream(postFile)) {
            for (int i = 0; i < 5; i++) {
                *//*String format = simpleDateFormat.format(new Date());
                Date parse = simpleDateFormat.parse(format);*//*
                postList.add(new Post(123+i,"机车"+i,"机车陪美女"+i,new Date(),9520+i,i));
            }
            String s = JSONObject.toJSONString(postList);
            outputStream.write(s.getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            e.printStackTrace();
        }
        try (OutputStream outputStream = new FileOutputStream(typeFile)) {
                typeList.add(new Type(0,"体育栏目"));
                typeList.add(new Type(1,"军事栏目"));
                typeList.add(new Type(2,"娱乐栏目"));
                typeList.add(new Type(3,"民生栏目"));
                typeList.add(new Type(4,"新闻栏目"));
            String s = JSONObject.toJSONString(typeList);
            outputStream.write(s.getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    static {
        //在这里读取
        try (FileInputStream fileInputStream = new FileInputStream(userFile)) {
            byte[] bytes = new byte[(int) userFile.length()];
            fileInputStream.read(bytes);
            String s = new String(bytes);
            userList = JSONObject.parseArray(s, User.class);
        }catch (IOException e){
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream(postFile)) {
            byte[] bytes = new byte[(int) postFile.length()];
            fileInputStream.read(bytes);
            String s = new String(bytes);
            postList = JSONObject.parseArray(s, Post.class);
        }catch (IOException e){
            e.printStackTrace();
        }

        try (FileInputStream fileInputStream = new FileInputStream(typeFile)) {
            byte[] bytes = new byte[(int) typeFile.length()];
            fileInputStream.read(bytes);
            String s = new String(bytes);
            typeList = JSONObject.parseArray(s, Type.class);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<User> getUserList() {
        return userList;
    }

    public static List<Post> getPostList() {
        return postList;
    }

    public static List<Type> getTypeList() {
        return typeList;
    }
}

class TestJson {
    public static void main(String[] args) {
        new DbUtil();
    }
}
