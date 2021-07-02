package thridTest.dao;

import thridTest.db.DbUtil;
import thridTest.pojo.Post;

import java.util.List;

public class PostDaoImpl implements  PostDao{

    @Override
    public List<Post> getAllPost() {
        return DbUtil.getPostList();
    }

    //帖子往哪添加      json   添加到集合中  调用写入文件的方法
    @Override
    public void insert(Post post) {
        DbUtil.writerJson(post);
    }

}
