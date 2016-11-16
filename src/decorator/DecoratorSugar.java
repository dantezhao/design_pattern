package decorator;

/**
 * Created by Dante on 2016/11/15.
 */
public class DecoratorSugar extends Decorator{
    public DecoratorSugar(Report rt) {
        super(rt);
    }

    private void reportSugar() {
        System.out.println("朕收下这批侍女只是为了给宫中多加点劳动力，剩的累到皇后了。朕只爱皇后一个~");
    }

    public void report() {
        this.reportSugar();
        super.report();
    }
}
