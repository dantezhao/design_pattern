package factory;

/**
 * Created by Dante on 2016/11/10.
 */
public class BlueToy implements Toy{
    @Override
    public void getColor() {
        System.out.println("我是小蓝人~");
    }

    @Override
    public void talk() {
        System.out.println("小蓝人说话说不停，太吵了！~");
    }
}
