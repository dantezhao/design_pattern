package decorator;

/**
 * Created by Dante on 2016/11/15.
 */
public class DecoratorCompare extends Decorator{

    public DecoratorCompare(Report rt) {
        super(rt);
    }

    private void reportCompare() {
        System.out.println("皇后大人，你看啊，大臣们总共进贡了1万名宫女，朕如果一个不收实在是寒了众爱卿的心啊！");
    }

    public void report() {
        this.reportCompare();
        super.report();
    }
}
