package decorator;

/**
 * Created by Dante on 2016/11/15.
 */
public class SugarReportHireMaid extends ReportHireMaid {

    private void reportCompare() {
        System.out.println("皇后大人，你看啊，大臣们总共进贡了1万名宫女，朕如果一个不收实在是寒了众爱卿的心啊！");
    }

    private void reportSugar() {
        System.out.println("朕收下这批侍女只是为了给宫中多加点劳动力，怕平日的工作累到皇后了。朕只爱皇后一个~");
    }

    private void reportMaidNotBeautiful() {
        System.out.println("朕最后挑选的这批侍女，长相都一般般，你想啊，进来干活的，要漂亮的有什么用！");
    }

    public void report() {
        reportCompare();
        reportSugar();
        reportMaidNotBeautiful();
        super.report();

    }

}
