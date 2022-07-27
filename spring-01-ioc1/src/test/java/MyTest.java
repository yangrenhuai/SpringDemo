import cn.edu.svtcc.dao.UserDaoImpl;
import cn.edu.svtcc.service.UserService;
import cn.edu.svtcc.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        //用户调用的是业务层，不需要接触dao层
        UserServiceImpl userService = new UserServiceImpl();
        userService.getUser();
    }
}
