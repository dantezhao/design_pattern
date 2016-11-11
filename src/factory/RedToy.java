package factory;

/**
 * Created by Dante on 2016/11/10.
 */
public class RedToy implements Toy {
    @Override
    public void getColor() {
        System.out.println("我是小红人~");
    }

    @Override
    public void talk() {
        System.out.println("小红人性格很好，说话也讨人喜欢~~");
    }
}
