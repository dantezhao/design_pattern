package decorator;

/**
 * Created by Dante on 2016/11/15.
 */
public abstract class Decorator extends Report{
    private Report rt;

    public Decorator(Report rt) {
        this.rt = rt;
    }

    public void report() {
        this.rt.report();
    }
}
