/**
 * @author Patrick O'Brien
 * @version 1.0
 * CharList Class
 * Lab 3
 * */

public class CharList {
    // may assume no string will grow beyond 100 characters in this lab
    // Question: Should we make this data private?
    // Answer: Yes, unless the program specifically needs it, the instance variable should always be private.
    private char[] chars = new char[100]; // an array to store characters

    public CharList() { } // default constructor

    public CharList(String startStr) // use string to set up internals
    {

    }

    public CharList(CharList other) // copy c'tor; be sure to check for null input
    {
        if (other == null)
        {
            return;
        }

    }

    // Question: could we make this so it grows to accommodate more than 100 elements?
    // Answer: Yes - we could, either through allocating a new array or creating a list.
    public void add(char next)
    {

    }

    public char get(int index)
    {
        return 'i';
    }

    // Return a string that is the concatenated result of combining every character in your char array.
    @Override
    public String toString()
    {
        return "";
    }

    public boolean equals(Object other)
    {
        if (!(other instanceof CharList))
        {
            return false;
        }
        // Two strings are the same if they share the same length and the same characters


        return true;
    }

//    Sample Output
//
//    a is :katnis and has 6 chars
//    b is :Batman and has 6 chars
//    c is :Batman and has 6 chars
//    B and A are equal : false
//    B and C are equal : true

}

