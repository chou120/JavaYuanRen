package thridTest.dao;

import thridTest.pojo.User;

public interface UserDao {

    User getById(Integer id);

    //登录
    User   login(String name,String password);


}
