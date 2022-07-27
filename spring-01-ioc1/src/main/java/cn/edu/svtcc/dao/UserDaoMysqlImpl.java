package cn.edu.svtcc.dao;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("获取Mysql中的用户数据");
    }
}
