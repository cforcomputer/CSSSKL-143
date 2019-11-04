/**
 * @author Patrick O'Brien
 * @version 10/28/2019
 *
 * Answers to Questions in Lab 5.2
 *  What methods are polymorphic in the Employee Hierarchy?
 * A: Any method that is reused with the classes. CalculateWeeklyPay() is one
 * such example, given that it is reused and has multiple versions of itself
 * throughout the employee hierarchy.
 *
 *  How could we build a method like getRandShape() above but for use with Employees?
 * A: You could make a new class called getRandEmployee() that uses random
 * values instead of of constants, it could also randomize any input value
 * and return the result like the other classes.
 *
 *  If we built a getRandomEmployee() method that returns various Employee subclass
 * objects; write a few lines of code that would demonstrate late binding
 * A: Employee j = new getRandomEmployee;
 * j.draw();
 * ?
 * A little bit lost regarding late binding.
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
