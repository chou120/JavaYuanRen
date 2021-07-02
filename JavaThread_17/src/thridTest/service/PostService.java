package thridTest.service;

import thridTest.dao.*;
import thridTest.pojo.Post;
import thridTest.pojo.Type;
import thridTest.pojo.User;

import java.util.ArrayList;
import java.util.List;

public class PostService {

    private UserDao userDao = new UserDaoImpl();
    private TypeDao typeDao = new TypeDaoImpl();
    private PostDao postDao = new PostDaoImpl();

    public List<String> getAll() {
        String str="";
        List<String> list = new ArrayList<>();
        List<Post> allPost = postDao.getAllPost();  //uid    typeid

        for (Post post : allPost) {
            User byId1 = userDao.getById(post.getUid());   //为了得了用户的名字和 帖子的类型
            Type byId = typeDao.getById(post.getTypeid());
            str+=post.getTitle()+","+post.getContext()+","+post.getCreatetime()+","+byId1.getUsername()+","+byId.getType();
            list.add(str);
            str="";
        }
        return list;
    }


    //登录之后查询所有的跟自己有关的帖子
    public  List<Post>  getAllByUserId(Integer uid){  //登录之后的人的id   user,getId();  uid   typeid
        ArrayList<Post> objects = new ArrayList<>();
        //首先要登录
        List<Post> allPost = postDao.getAllPost();
        for (Post post : allPost) {
            if(uid.equals(post.getUid())){
                objects.add(post);
            }
        }
        return  objects;
    }

    //添加帖子
    public  void  insertPost(Post post){

        postDao.insert(post);
    }

    //查看指定类型的帖子
    public  List<Post> getByTypeAllPost(String  type){

        //TODO
        return  null;
    }
    //根据帖子编号删除
    public  void  deleteById(Integer postId){
        //TODO
    }

    //根据编号查询帖子
    public  Post getById(Integer postId){
        //TODO
        return null;
    }

    //修改

}
