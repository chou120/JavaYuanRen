package thridTest.dao;

import thridTest.db.DbUtil;
import thridTest.pojo.User;

import java.util.List;

public class UserDaoImpl  implements UserDao{
    @Override
    public User getById(Integer id) {
        List<User> userList = DbUtil.getUserList();
        for (User user : userList) {
            if(id.equals(user.getId())){
                return user;
            }
        }
        return null;
    }

    @Override
    public User login(String name, String password) {
        List<User> userList = DbUtil.getUserList();
        for (User user : userList) {
            if(user.getUsername().equals(name) && user.getPassword().equals(password)){
                return  user;
            }
        }
        return null;
    }


}
