package knights;

import java.io.PrintStream;

/**
 * Created with Project: SpringiA4
 * User: Casey
 * Date: 2017/6/8　10:54
 * Description: Quest的实现: 杀死一条巨龙 => 可用来注入到 BraveKnight 中
 */
public class SlayDragonQuest implements Quest {

    private PrintStream stream;

    public SlayDragonQuest(PrintStream stream) {
        this.stream = stream;
    }

    @Override
    public void embark() {
        stream.println("Embarking on quest to slay the dragon");
    }
}
