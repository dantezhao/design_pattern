package singleton;

/**
 * Created by Dante on 2016/11/9.
 */
public class Maid {
    public static void main(String[] args) {
        for(int i = 1 ; i < 4; i++) {
            Queen queen = Queen.getInstance();
            System.out.println("今天是第 " + i + " 天请安！");
            queen.say();
        }
    }
}
