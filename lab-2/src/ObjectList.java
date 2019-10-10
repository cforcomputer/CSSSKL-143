/**
 * @author Patrick O'Brien
 * @version 1.0
 * 10/07/2019
 * Class design - ObjectList
 * */

/*
Answers to questions:
     Q: Why did we do so much copying-and-pasting in our software above?
     A: To save time, we are performing the same task between different classes
          with problems that only differ slightly in their form.

     Q: How can this approach be problematic?
     A: It can lead to duplicated code, comments, and logic errors. You don't
        take as much time double checking your problems when you copy and paste.

     Q: Are there obvious improvements that could be made here with respect to the
        software design for Squares and Circles?
     A: Yes. There are redundancies in Square, certain constructors could be removed.
        There unused methods in both classes.

     Q: What programming constructs were you familiar with, and which did you need
        to look up?
     A: I needed to review the difference between a getter and a setter.
        I also needed to look up how getEquals works, because I thought I needed
        to compare strings for some reason. Beyond that I felt pretty good about the
        different constructs in this exercise. It's the instructions I had trouble with.
        I'm not sure whether or not we need to declare main(String[] args) for the
        driver to work in both ObjectList and Circle/Square? Not sure how to get them
        to work together. (How we are supposed to get them to work together).

     Q: Assume we used a separate array for Squares and for Circles rather than one
        unifying Object array.
            How would this complicate the task of adding a new shape (say, a triangle)
            to our ObjectList class?
     A: We would have to create a new array for each object, then call each class
        individually and run through each array. It would less efficient and tedious
        to code.
 */
public class ObjectList {
    private int numElements = 0; // This integer tracks the number of live shapes in array
    private Object[] myShapes; // Declare an integer array called "data"
    // Question: What about primitives?
    // Answer: Primitives are auto-boxed into their respective wrapper types. ex:
    // 1 becomes Integer.valueOf(1).
    public void add(Object shape) {
        myShapes[numElements++] = shape; // add value n  to array and add 1 to numElements
    }

    @Override
    public String toString() {
        String retVal = "";
        // iterates through the array, calling toString() on each shape and appending
        // this to one large string to be returned.
        for(int i = 0; i < numElements; i++) {
            retVal += myShapes[i] + ", ";
        }
        return retVal;
    }

//    //main goes here from the lab
//    // Do you see the output for each integer added to the list?
//    public static void main(String[] args) {
//        ObjectList a = new ObjectList();
//
//    }
}
