package soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with Project: SpringiA4
 * User: Casey
 * Date: 2017/6/10　14:36
 * Description:
 */
@Configuration
@ComponentScan()  //命令 Spring 寻找带有 @Component 注解的类(默认找该文件所在包)
//@ComponentScan(basePackageClasses = {SgtPeppers.class,CDPlayer.class}) //SgtPeppers类所在的包都会被扫描
//@ComponentScan(basePackages = {"soundsystem","video"}) // 该方法也可以, 但是类型不安全
// 最好的方法是在包中创建一个用来进行扫描的空标记接口. 来作为组件扫描的参数, 便于以后重构
public class CDPlayerConfig {
}
