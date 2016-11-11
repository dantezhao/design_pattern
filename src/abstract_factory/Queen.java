package abstract_factory;


/**
 * Created by Dante on 2016/11/9.
 */
public class Queen {
    public static void main(String[] args) {
        //第一条生产线，生产小伙子
        ToyFactory maleToyFactory = new MaleToyFactory();
        //第二条生产线，生产萌妹子
        ToyFactory femaleToyFactory = new FemaleToyFactory();

        System.out.println("---生产一个红色的萌妹子！---");
        Toy femaleRedToy = femaleToyFactory.createRedToy();
        femaleRedToy.getColor();
        femaleRedToy.getSex();
        femaleRedToy.talk();

        System.out.println("---生产一个黑色小伙子！---");
        Toy maleBlackToy = maleToyFactory.createBlackToy();
        maleBlackToy.getColor();
        maleBlackToy.getSex();
        maleBlackToy.talk();

    }
}
