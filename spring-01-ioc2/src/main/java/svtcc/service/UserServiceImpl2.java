package svtcc.service;

import svtcc.dao.UserDao;

/**
 * 新增set方法，利用set方法实现动态注入
 * 在UserServiceImpl中，控制权在程序员手里
 * 在UserServiceImpl2中，使用setUserDao方法注入后，程序员不再具有主动性，二十被动接受对象
 * 这种思想，程序员不再管理对象的创建，很大程度上降低了系统的耦合性。可以更专注于业务的实现
 * 这就是IOC（控制反转）
 */
public class UserServiceImpl2 implements UserService{
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        this.userDao=userDao;
    }
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
