package factory;

/**
 * Created by Dante on 2016/11/9.
 */
public class Queen {
    public static void main(String[] args) {

        //创建一个阴阳炉，阴阳炉负责造小人
        AbstractToyFactory toyFactory = new YinYangToyFactory();

        System.out.println("------造一批小蓝人！------");
        Toy blueToy = toyFactory.createToy(BlueToy.class);
        blueToy.getColor();
        blueToy.talk();


        System.out.println("------造一批小黑人！------");
        Toy blackToy = toyFactory.createToy(BlackToy.class);
        blackToy.getColor();
        blackToy.talk();

        System.out.println("------造一批小红人！------");
        Toy redToy = toyFactory.createToy(RedToy.class);
        redToy.getColor();
        redToy.talk();

//        System.out.println("------造一批小黑人！------");
//        BlackToy blackToy1 = new BlackToy();
//        blackToy1.getColor();
//        blackToy1.talk();
//
//        System.out.println("------造一批小蓝人！------");
//        BlueToy blueToy1 = new BlueToy();
//        blueToy1.getColor();
//        blueToy1.talk();
//
//        System.out.println("------造一批小红人！------");
//        RedToy redToy1 = new RedToy();
//        redToy1.getColor();
//        redToy1.talk();

    }
}
