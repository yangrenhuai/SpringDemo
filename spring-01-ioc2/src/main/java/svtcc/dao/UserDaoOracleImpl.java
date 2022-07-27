package svtcc.dao;

public class UserDaoOracleImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("获取Oracle中的用户数据");
    }
}
