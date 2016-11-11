package proxy;

/**
 * Created by Dante on 2016/11/10.
 */
public class ProxyScene {
    public static void main(String[] args) {

        GirlSearcher emperor = EmperorGirlSearcher.getInstance();
        GirlSearcher eunuch = new EunuchProxyGirlSearcher(emperor);

        //由小太监替皇上出行
        //第一次选妃
        eunuch.travel();
        eunuch.search();
        eunuch.get();

        //第二次选妃
        eunuch.travel();
        eunuch.search();
        eunuch.get();
    }

}
