package abstract_factory;

/**
 * Created by Dante on 2016/11/10.
 */
public abstract class AbstractBlueToy implements Toy {
    public void getColor() {
        System.out.println("我是小蓝人~");
    }

    public void talk() {
        System.out.println("小蓝人说话说不停，太吵了！~");
    }
}
