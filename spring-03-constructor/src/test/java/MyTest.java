import cn.edu.svtcc.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        User user=(User) context.getBean("user");
        System.out.println(user.toString());

        User user2=(User) context.getBean("user2");
        System.out.println(user2);

        User user3=(User) context.getBean("user3");
        System.out.println(user3);

        User user4=(User) context.getBean("user4");
        System.out.println(user4);
    }

}
