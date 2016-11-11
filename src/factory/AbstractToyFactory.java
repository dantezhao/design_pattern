package factory;

/**
 * Created by Dante on 2016/11/10.
 */
public abstract class AbstractToyFactory {
    public abstract <T extends  Toy> T createToy(Class<T> c);
}
