/**
 * @author Patrick O'Brien
 * @version 10/28/2019
 * */

public class Consultant extends HourlyWorker {

    public static final double CONSULTANT_HOURLY = 50.20;

    public Consultant(String name, int social) {
        super(name, social, CONSULTANT_HOURLY);
    }

    public Consultant(String name, int social, double monthlyPay) {
        super(name, social, monthlyPay);
    }

    @Override
    public double calculateWeeklyPay() {
        return 20 * CONSULTANT_HOURLY;
    }
}
