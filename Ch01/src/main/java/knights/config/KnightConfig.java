package knights.config;

/**
 * Created with Project: SpringiA4
 * User: Casey
 * Date: 2017/6/8　11:00
 * Description: Spring基于java的配置,
 * BraveKnight 依赖于 Quest 但是它并不知道传递给它的是什么类型的 Quest, 也不知道这个 Quest 来自哪里.
 * 与之类似, SlayDragonQuest 依赖于 PrintStream, 但是在编码时它无需知道这个 PrintStream 是什么样子的.
 * 只有Spring 通过它的配置, 能够了解这些组成部分是如何装配起来的. 这样的话, 就可以在不改变所依赖的类的情况下
 * 修改依赖关系
 */

import knights.BraveKnight;
import knights.Knight;
import knights.Quest;
import knights.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {

    @Bean
    public Knight knight() {
        return new BraveKnight(quest());
    }

    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }

}
