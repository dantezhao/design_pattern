package proxy;

/**
 * Created by Dante on 2016/11/9.
 */
public class Scene {

    public static void main(String[] args) {

        GirlSearcher emperor = EmperorGirlSearcher.getInstance();
        //第一次选妃
        emperor.travel();
        emperor.search();
        emperor.get();

        //第二次选妃
        emperor.travel();
        emperor.search();
        emperor.get();
    }
}
