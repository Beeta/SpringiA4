import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with Project: SpringiA4
 * User: Casey
 * Date: 2017/6/12　17:28
 * Description: 测试 spring 获取属性的功能
 */

public class CunTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CunTestConfig.class);
        TestClass bean = context.getBean(TestClass.class);
        bean.out();
    }
}
