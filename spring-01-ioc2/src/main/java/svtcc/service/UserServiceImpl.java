package svtcc.service;

import svtcc.dao.UserDao;
import svtcc.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
    /**
     * 如果要调用UserDaoMysqlImpl的方法，必须更改userDao的实例化对象
     * 增加类的实现，只能修改原有的代码
     */
    private UserDao userDao=new UserDaoImpl();

    /**
     * 需要在getUser方法中调用dao层的方法
     */
    @Override
    public void getUser() {
        userDao.getUser();
    }
}
