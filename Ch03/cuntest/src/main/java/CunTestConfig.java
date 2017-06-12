import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created with Project: SpringiA4
 * User: Casey
 * Date: 2017/6/12　17:36
 * Description:
 */
@Configuration
@PropertySource("classpath:app.properties")
public class CunTestConfig {
    @Autowired
    Environment env;

    @Bean
    public TestClass testClass() {
        int a = env.getProperty("a", Integer.class); // 可指定返回类型
        return new TestClass(env.getProperty("b","哈哈哈")); // 若无该key 返回默认值
    }
}
