package com.yuanren.practice;

public class MethodFunction {

   private DButil dButil = new DButil();  //保持dButil对象的唯一性 就是为了保持 dbutil对象的数组唯一
    /**
     * 对 User数组做添加操作
     * @param user
     */
    public void addUser(User user){
        //首先要获取users数组

        User[] users = dButil.getUsers();
        int index = dButil.getIndex();
        users[index]=user;
        index++;
        dButil.setIndex(index);//自加之后要把自加之后的索引重新赋值给dbutil对象的index   方便下一次调用addUser()获取index

    }


    /**
     * 打印数组中所有的元素
     */
    public void  print(){
        User[] users = dButil.getUsers();
        for (int i = 0; i < dButil.getIndex(); i++) {
            System.out.println(users[i].toString());
        }
    }
}
