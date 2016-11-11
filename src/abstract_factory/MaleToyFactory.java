package abstract_factory;

/**
 * Created by Dante on 2016/11/10.
 */
public class MaleToyFactory implements ToyFactory {

    @Override
    public Toy createBlackToy() {
        return new MaleBlackToy();
    }

    @Override
    public Toy createBlueToy() {
        return new MaleBlueToy();
    }

    @Override
    public Toy createRedToy() {
        return new MaleRedToy();
    }
}
