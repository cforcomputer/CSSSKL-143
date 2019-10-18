/**
 * @author Patrick O'Brien
 * @version 1.0
 * Date Class
 * Lab 3
 * */

public class Date {
    private int month;
    private int day;
    private int year;

    // Question: What is the difference between public and private access modifiers?
    // Answer: Public modifiers can be accessed and modified anywhere inside or outside the class.
    // Private modifiers make it so that they can only be accessed and modified within the class.

    // Question: When data is defined as static... Can it be accessed or read?
    // Answer: data defined as static can only be accessed and read inside other static methods.
    // Only one copy of a static member exists to be accessed or read.

    // Question: Can static data be written to?
    // Answer: Yes, but only by other static methods & variables.

    // Question: If we had declared one static variable and 10 objects declared in RAM, how many static would also
    // be in memory?
    // Answer: One static variable

    // Question: When data is defined as final: can it be accessed or read?
    // Answer: It can be accessed and read

    // Question: When data is defined as final: can it be written to?
    // Answer: Only during the initialization

    // Question: When data is defined as final: Can it be written to other than the first initialization?
    // Answer: No, it cannot.

    // Question: When data is defined as final: why would it be ok to declare a final (or static final) variable as public?
    // Answer: Because if anyone outside the class were to try and access it, they would be unable to write
    // anything to it. If it cannot be modified, making it private becomes a redundant activity.

    // Question: How does the concept of a final variable relate to immutable classes? (Answer after)
    // Answer:

    // provide getter/setter methods for each of the variables above
    // Provide logic in your setter methods to observe the following class invariants

    public static void main(String[] args){
        Date d = new Date();
        d.setDate(10, 21, 2018);
        d.report();
    }

    //setter
    public void setDate(int m, int d, int y){//what should you check?
        this.month = m;
        this.day = d;
        this.year = y;
    }
    //prints out date
    public void report(){
        System.out.printf("%d/%d/%d",month, day, year);

    public void setMonth(int month)
    {
        this.month = month;
    }
    public void setDay(int day)
    {
        this.day = day;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public int getMonth()
    {
        return month;
    }
    public int getDay()
    {
        return day;
    }
    public int getYear()
    {
        return year;
    }

    public Date() {}; // default no-arg constructor
    public Date(int m, int d, int y)
    {
        // Question: Should we use month = m, or setMonth(m)? What are the differences?
        // We should use setMonth(m); since month = m only works in one instance, when the object is initialized.
        // Using the setter methods instead will allow for the values to be modified at any time during the
        // lifespan of the object.
    }
    // This method is a copy constructor; initialize your object’s data members (this.month, etc) using “other”.
    public Date(Date other)
    {

    }

    public String toString()
    {
        return "";
    }

    // In this method, you'll compare "this" to "that", once object has been checked and cast
    public boolean equals(Object other)
    {
        return false;
    }

//    Sample Output
//
//    a is :0.0.0
//    b is :2.1.2030
//    c is :2.1.2030
//    B and A are equal: false
//    B and C are equal: true

}
