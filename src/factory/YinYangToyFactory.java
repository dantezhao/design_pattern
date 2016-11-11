package factory;

/**
 * Created by Dante on 2016/11/10.
 */
public class YinYangToyFactory extends AbstractToyFactory {
    @Override
    public <T extends Toy> T createToy(Class<T> c) {
        Toy toy = null;
        try {
            toy = (Toy) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println(e);
        }

        return (T) toy;
    }
}
