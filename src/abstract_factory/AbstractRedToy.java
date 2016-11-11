package abstract_factory;

/**
 * Created by Dante on 2016/11/10.
 */
public abstract class AbstractRedToy implements Toy{
    public void getColor() {
        System.out.println("我是小红人~");
    }

    public void talk() {
        System.out.println("小红人性格很好，说话也讨人喜欢~~");
    }
}
