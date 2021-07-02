package thridTest.dao;

import thridTest.pojo.Post;

import java.util.List;

public interface PostDao {
    //显示所有的帖子
     List<Post> getAllPost();   // 标题  内容  帖子创建的时间   作者


    void insert(Post post);

}
