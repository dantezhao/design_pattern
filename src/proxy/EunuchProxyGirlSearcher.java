package proxy;

/**
 * Created by Dante on 2016/11/9.
 */
public class EunuchProxyGirlSearcher implements GirlSearcher {
    private GirlSearcher girlSearcher = null;
    public EunuchProxyGirlSearcher(GirlSearcher girlSearcher) {
        this.girlSearcher = girlSearcher;
    }
    @Override
    public void travel() {
        this.girlSearcher.travel();
    }

    @Override
    public void search() {
        this.girlSearcher.search();
    }

    @Override
    public void get() {
        this.girlSearcher.get();
    }
}
