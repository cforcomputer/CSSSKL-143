/**
 * @author Patrick O'Brien
 * @version 1.0
 * 10/07/2019
 * Class design - Date V0.0 & V1.0
 * */

public class DATE {

    // Q: What does it mean to be a date?
    // Alternatively, what does a date have? ("has a" == composition)
    // A date needs to have a day, month, and year. Furthermore, the day month and year must be able to change
    // independently of one another. There should then be 3 separate variables to handle each one. These can be ints,
    // these ints would represent the "state" - the elements that we would need to keep track of.

    // What can a date do?
    // What are the actions and verbs that can be applied to a date? These become the class's methods.
    // Actions could be; change year, change month, change day, reset date

    // Try adding 3 data items to your Date to manage the month, day, and year.
    // Should these be local variables? Class-level (or instance) variables?
    // A: It should be instance variables for the convenience of use between the different methods.
    private static int day;
    private static int month;
    private static int year;

    // Now let's build a method to set the date
    // This function should take 3 integers as input and assign these to your >instance variables< declared in the
    // previous step.

    public static void setDate(int m, int d, int y)
    {
        day = m;
        month = d;
        year = y;
    }

    // Create a simple main() to test your Date in class.
    public static void main(String[] args)
    {
        setDate(5, 10, 15);
    }
}
