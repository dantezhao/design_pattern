package strategy;

/**
 * Created by Dante on 2016/11/11.
 */
public class Scene {
    public static void main(String[] args) {

        System.out.println("------皇后十分不高兴，正在扔瓶子。拆开第一个锦囊！------");

        //拿出妙计,实施妙计
        Strategies.Praise.operate();

        System.out.println("------皇后依旧不高兴，不理朕。拆开第二个锦囊！------");
        //拿出妙计,实施妙计
        Strategies.SendGift.operate();

        System.out.println("------皇后态度稍缓，但仍一脸寒霜。拆开第三个锦囊！------");
        //拿出妙计,实施妙计
        Strategies.WatchDrama.operate();

        System.out.println("------皇后总算好了，不再生气了。朕可以发兵打仗了！！！------");


    }
}
