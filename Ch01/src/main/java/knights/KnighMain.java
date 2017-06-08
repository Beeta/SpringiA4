package knights;

import knights.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with Project: SpringiA4
 * User: Casey
 * Date: 2017/6/8　11:35
 * Description:
 */
public class KnighMain {
    public static void main(String[] args) throws Exception {
        // 这是使用基于java配置的用法
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/knights.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
