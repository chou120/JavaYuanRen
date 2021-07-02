package thridTest.test;

import thridTest.dao.TypeDaoImpl;
import thridTest.dao.UserDaoImpl;
import thridTest.pojo.Post;
import thridTest.pojo.Type;
import thridTest.pojo.User;
import thridTest.service.PostService;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestAllPost {

    public static void main(String[] args) {
        System.out.println("欢迎进入xxx论坛");
        PostService postService = new PostService();
        List<String> all = postService.getAll();

        for (String s : all) {
            System.out.println(s);
        }

        System.out.println("请输入要执行的操作:");
        System.out.println("1.登录");
        System.out.println("2.注册");


        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        UserDaoImpl userDao = new UserDaoImpl();
        switch (i){
            case 1:
                User login = userDao.login("张三0","123450");
                if(login!=null){
                    PostService postService1 = new PostService();
                    List<Post> allByUserId = postService1.getAllByUserId(login.getId());
                    System.out.println("欢迎"+login.getUsername()+"的登录");
                    for (Post post : allByUserId) {
                        System.out.println(post);
                    }

                    TypeDaoImpl typeDao = new TypeDaoImpl();
                    List<Type> alltype = typeDao.getAlltype();
                    for (Type type : alltype) {
                        System.out.println(type);
                    }

                    //在添加帖子之前要获取类型
                    System.out.println("请输入帖子类型:");
                    String next = scanner.next();

                    Integer tid=null;
                    for (Type type : alltype) {
                        if(next.equals(type.getType())){
                           tid=type.getId();
                           break;
                        }
                    }

                    if(tid!=null){
                        //添加帖子操作
                        Post post = new Post(9, "美女和野兽", "精钢和金刚",new Date(),login.getId(), tid);
                        //调用添加帖子的方法
                        postService.insertPost(post);
                        System.out.println("添加之后获取自己已经发布过的帖子:");
                        //显示一下自己添加之后的帖子
                        allByUserId = postService1.getAllByUserId(login.getId());
                        for (Post post1 : allByUserId) {
                            System.out.println(post1);
                        }

                    }

                }

                break;
        }
    }
}
