package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created with Project: SpringiA4
 * User: Casey
 * Date: 2017/6/10　14:28
 * Description: CompactDisc 的一个具体实现, 这是甲壳虫乐队的一张专辑 <佩珀中士的孤独之心俱乐部乐队>
 */
@Component  // @Component 表明该类会作为组件类, Spring 会为这个类创建bean
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
