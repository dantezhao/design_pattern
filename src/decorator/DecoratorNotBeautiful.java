package decorator;

/**
 * Created by Dante on 2016/11/15.
 */
public class DecoratorNotBeautiful extends Decorator{
    public DecoratorNotBeautiful(Report rt) {
        super(rt);
    }

    private void reportNotBeautiful() {
        System.out.println("朕最后挑选的这批侍女，长相都一般般，你想啊，进来干活的，要漂亮的有什么用！");
    }

    public void report() {
        this.reportNotBeautiful();
        super.report();
    }
}
