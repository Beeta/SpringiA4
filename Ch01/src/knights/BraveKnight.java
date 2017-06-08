package knights;

/**
 * Created with Project: SpringiA4
 * User: Casey
 * Date: 2017/6/8　10:42
 * Description: 使用DI(依赖注入) 之 构造器注入 方法改进 DamselRescuingKnight
 */
public class BraveKnight implements Knight {
    private Quest quest;

    /*
     * Quset 被注入进来 <= 构造器注入(BraveKnight没有自己创建探险任务, 而是构造的时候由构造器参数传入)
     * 传入的类型是Quest接口, 而非具体的探险任务
     * 这里的要点是, BraveKnight 没有与任何特定的Quest实现发生耦合
     */
    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
