package cn.edu.svtcc.service;

import cn.edu.svtcc.dao.UserDao;

/**
 * 新增set方法，利用set方法实现动态注入
 */
public class UserServiceImpl2 implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public void getUser() {

    }
}
