import cn.edu.svtcc.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 我们的对象都在Spring中管理了，直接取出来使用即可
        Hello hello=(Hello)context.getBean("hello");
        System.out.println(hello.toString());
    }
}
