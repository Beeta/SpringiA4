package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created with Project: SpringiA4
 * User: Casey
 * Date: 2017/6/10　15:41
 * Description:
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired  // 标明当Spring创建 CDPlayer bean 的时候, 会通过这个构造器来进行实例化,
    // 并且会注入一个可设置给 CompactDisc 类型的bean  <= @Autowired 的作用
    // @Autowired(required = false) 的作用: 如果没有匹配的bean 就让这个bean处于未装配状态
    // 我的理解, 方法或者成员变量前加了 @Autowired 就代表让Spring自动从上下文应用里找适合的bean注入这个方法
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
