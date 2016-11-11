package strategy;

/**
 * Created by Dante on 2016/11/11.
 */
public enum Strategies {
    WatchDrama {
        public void operate() {
            System.out.println("走！朕带你去看");
        }
    },
    SendGift {
        public void operate() {
            System.out.println("yyj，我摘了个小一点的太阳当礼物送给你暖暖手~");
        }
    },
    Praise {
        public void operate() {
            System.out.println("yyj，你是天下第一美人~");
        }
    };

    public abstract void operate();
}
