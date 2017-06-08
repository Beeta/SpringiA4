package knights;

import java.io.PrintStream;

/**
 * Created with Project: SpringiA4
 * User: Casey
 * Date: 2017/6/8　12:00
 * Description: AOP面向切面编程学习: 吟游诗人服务类, 用来记载骑士的所有事迹
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() { // 探险之前调用
        stream.println("哇,哇,哇, 这个骑士真勇敢!");
    }

    public void singAfterQuest() {
        stream.println("哈哈哈, 这个勇敢的骑士执行完了任务!");
    }
}
