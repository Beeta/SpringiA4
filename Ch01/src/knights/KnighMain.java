package knights;

import knights.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created with Project: SpringiA4
 * User: Casey
 * Date: 2017/6/8　11:35
 * Description:
 */
public class KnighMain {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
