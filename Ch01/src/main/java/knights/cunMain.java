package knights;

/**
 * Created with Project: SpringiA4
 * User: Casey
 * Date: 2017/6/8　11:53
 * Description: 原生不使用spring装配方法的实现
 */
public class cunMain {
    public static void main(String[] args) {
        Quest quest = new SlayDragonQuest(System.out);
        Knight knight = new BraveKnight(quest);
        knight.embarkOnQuest();
    }
}
