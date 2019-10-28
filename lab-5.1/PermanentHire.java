import java.util.MissingFormatArgumentException;

/**
 * @author Patrick O'Brien
 * @version 10/28/2019
 *
 * Create a class called PermanentHire that inherits from
 * SalariedWorker.
 * */

public class PermanentHire extends SalariedWorker{

    // Create constructors, model after Accountant
    private double yearlyPayAmount = 60000;
    private static final double MIN_SALARY = 50000;
    /**
     * Constructor takes name and social
     * */
    public PermanentHire(String name, int social) {
        super(name, social, MIN_SALARY);
    }

    /**
     * Constructor takes name, social, and a custom pay input instead
     * of the default value.
     * */
    public PermanentHire(String name, int social, double yearlyPay) {
        super(name, social, yearlyPay);
        if (yearlyPay > 0.0) {
            yearlyPayAmount = yearlyPay;
        }
    }

    /**
     * Try overriding calculateWeeklyPay() method in your subclass so it does
     * something different than the original version.
     *
     * Consider making PermanentHire an employee that has a base salary plus
     * a flat bonus every month, which would require a new (overridden)
     * calculateWeeklyPay() method.
     * */
    @Override
    public double calculateWeeklyPay() {
        // calculate the monthly pay to the weekly pay from the yearly pay as example.
        // + $200 weekly bonus? idk sure
        return ((yearlyPayAmount / 12) / 4) + 200;
    }
}
