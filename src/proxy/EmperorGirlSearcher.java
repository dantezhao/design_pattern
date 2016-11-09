package proxy;

/**
 * Created by Dante on 2016/11/9.
 */
public class EmperorGirlSearcher implements GirlSearcher{
    private static EmperorGirlSearcher emperorGirlSearcher = new EmperorGirlSearcher();

    private EmperorGirlSearcher(){}

    public static EmperorGirlSearcher getInstance() {
        return emperorGirlSearcher;
    }

    @Override
    public void travel() {
        System.out.println("出行江南！");
    }

    @Override
    public void search() {
        System.out.println("寻得一美人！");
    }

    @Override
    public void get() {
        System.out.println("收入帐下！");
    }
}
