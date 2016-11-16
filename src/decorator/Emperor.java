package decorator;

/**
 * Created by Dante on 2016/11/15.
 */
public class Emperor {

//    public static void main(String[] args) {
//        Report report = new SugarReportHireMaid();
//        report.report();
//    }

    public static void main(String[] args) {
        Report rt = new ReportHireMaid();
        rt = new DecoratorSugar(rt);
        rt = new DecoratorCompare(rt);
        rt = new DecoratorNotBeautiful(rt);
        rt.report();
    }
}
