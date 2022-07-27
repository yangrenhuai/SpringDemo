import cn.edu.svtcc.dao.UserDaoImpl;
import cn.edu.svtcc.dao.UserDaoMysqlImpl;
import cn.edu.svtcc.service.UserService;
import cn.edu.svtcc.service.UserServiceImpl2;

public class MyTest2 {
    public static void main(String[] args) {
        UserServiceImpl2 userService=new UserServiceImpl2();
        userService.setUserDao(new UserDaoMysqlImpl());
        userService.getUser();
    }
}
