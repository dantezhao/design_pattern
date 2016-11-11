package factory;

/**
 * Created by Dante on 2016/11/10.
 */
public class BlackToy implements Toy {
    @Override
    public void getColor() {
        System.out.println("我是小黑人~");
    }

    @Override
    public void talk() {
        System.out.println("小黑人方言太重，平常人听不懂！");
    }
}
