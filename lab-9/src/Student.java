import java.io.*;

/**
 * @author Patrick O'Brien
 * @version 11/25/2019
 * */

// Build a class definition so that it implements comparable
public class Student implements Comparable<Student>, Serializable {

    // (1) Build a Student Class with only two data items: a String name and a double GPA.
    private String name;
    private double GPA;

//    // write
//    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data.obj"));
//
//    // read
//    ObjectInputStream is = new ObjectInputStream(new FileInputStream("data.obj"));
    /**
     * (4) Build main to test your Students, and in this main build a list of 10 Students with different GPAs.
     * */
    public static void main(String[] args) {
//        comparableDemo ns_1 = new comparableDemo();
//        comparableDemo ns_2 = new comparableDemo();
//        comparableDemo ns_3 = new comparableDemo();
//        comparableDemo ns_4 = new comparableDemo();
//        comparableDemo ns_5 = new comparableDemo();
//        comparableDemo ns_6 = new comparableDemo();
//        comparableDemo ns_7 = new comparableDemo();
//        comparableDemo ns_8 = new comparableDemo();
//        comparableDemo ns_9 = new comparableDemo();
//        comparableDemo ns_10 = new comparableDemo();
    }



    /**
     * Copy constructor
     * */
    public Student(Student other) throws IOException {
        setName(other.name);
        setGPA(other.GPA);
    }

    /**
     * Constructor that takes two values
     * */
    public Student(String name, double GPA) throws IOException {
        setName(name);
        setGPA(GPA);
    }

    /**
     * (3) When designing the compareTo() method, use the GPA to determine if student1 > student2.
     * a. Consider returning the difference between the two students as the magnitude of
     * difference (either positive or negative)
     * */
    @Override
    public int compareTo(Student o) {
        if (this.getGPA() < o.GPA) {
            return 1;
        }
        return -1;
    }

    /**
     * Method to override clone
     * and implement cloneable
     * */
    @Override
    protected Object clone() {
        // creating and returning a Student using a copy constructor
        try {
            return new Student(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Getter for name
     * */
    public String getName() {
        return name;
    }

    /**
     * Getter for GPA
     * */
    public double getGPA() {
        return GPA;
    }

    /**
     * Setter for name
     * */
    public void setName(String name) {
        name = this.name;
    }

    /**
     * Setter for GPA
     * */
    public void setGPA(double GPA) {
        GPA = this.GPA;
    }

}
