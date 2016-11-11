package abstract_factory;

/**
 * Created by Dante on 2016/11/10.
 */
public class FemaleToyFactory implements ToyFactory {

    @Override
    public Toy createBlackToy() {
        return new FemaleBlackToy();
    }

    @Override
    public Toy createBlueToy() {
        return new FemaleBlueToy();
    }

    @Override
    public Toy createRedToy() {
        return new FemaleRedToy();
    }
}
