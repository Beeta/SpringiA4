package knights;

/**
 * Created with Project: SpringiA4
 * User: Casey
 * Date: 2017/6/8　10:36
 * Description: Damsel Rescuing Knight 拯救 少女 的骑士
 * 该类耦合性太严重, 倘若让骑士进行其他任务比如杀一条龙之类的就不好办了, 改进参看  BraveKnight 类
 */
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest; // 拯救少女任务

    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }

    public  void embarkOnQuest() {
        quest.embark();
    }
}
