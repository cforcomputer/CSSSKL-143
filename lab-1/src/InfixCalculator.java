import java.util.Scanner;

/**
 * @author Patrick O'Brien
 * Course: CSSSKL 143
 * @project lab 1
 *
 * Note to self: REVIEW AND COMPLETE THIS PROGRAM IF TIME
 * */
// Build a basic calculator that ignores order of operations
/*
 * InFixCalc, V0.0 (concept borrowed from Carol Zander's Infix Calculator)
 * Exercise author: Rob Nash
 * Complete the calculate() function below to build a simple, infix
 * calculator that evaluates a compound expression from left to right,
 * regardless of operator precedence
 *
 * Example: " 1 * -3 + 6 / 3"
 * Execution: calculate 1 * -3 first, then -3 + 6 next, then 3 / 3
 * last to obtain the value 1
 *
 * Solution by
 */
public class InfixCalculator {
    //example pattern: "3 + 5"
    //general pattern: <lhs='3'> <operation='+'> <rhs='5'> //extended pattern:     ...
    //special case:
    //other special cases?

    public static void main(String[] args) { //String input = "4 + 4";
        //String input = "4 + 4 / 2";
        //String input ="1 * -3";
        String input ="1 * -3 + 6 / 3";
        //String input ="5";
        //String input ="-5";
        int answer = calculate(input);
        System.out.println("Answer is " + answer);
    }

    //preconditions: all binary operations are separated via a space <<<
    //postconditions: returns the result of the processed string
    public static int calculate(String input) {
        int lhs = 0, rhs = 0; //short for left-hand & right-hand side
        char operation;
        /*todo: your name and code goes here
        * @author Patrick O'Brien
        * */
        /*You need a Scanner(or StringTokenizer) to get tokens
         *Then you need a loop, and switch inside that loop*/
        // get tokens
        // if a number is negative, like -3, there will be no space between the sign and the number.
        // user Scanner and NextInt() to reach the next integer. Use Scanner and which operation to
        // read a single character?
        // Using the comments below, can you write a regular expression that would recognize this grammar?

        // Regular expression (what are regular expressions?) = regex in java, util.regex.Pattern, util.regex.Matcher,
        // Pattern pattern = Pattern.compile("geeks");
        // Matcher m = pattern.matcher("geeksforgeeks.org);
        // while (m.find())
        //      System.out.println("Pattern found from " + m.start() + " to " + (m.end()-1));
        // conclusion: Regular expressions - or regex is when the same pattern appears anywhere in a given
        // string or sequence of numbers regardless of spaces.
        Scanner key = new Scanner(System.in);


        return lhs;
    }
}