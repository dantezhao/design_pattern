package singleton;

/**
 * Created by Dante on 2016/11/9.
 */
public class Queen {
    private static final Queen queen = new Queen();
    private Queen() {

    }
    public static Queen getInstance() {
        return queen;
    }

    public static void say() {
        System.out.println("本宫是yyj，尔等跪安吧~");
    }
}
