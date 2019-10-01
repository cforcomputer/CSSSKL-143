import java.util.Scanner;
/**
 * @author Patrick O'Brien
 * Course: CSSSKL 143
 * @project lab 1
 * */
/*
    Declare a new program or class (if this is eclipse, make a new project first).
    Define the main function.
    Inside main, declare a Scanner object (don’t forget your import!).
    Define a variable called product. Should this start at 0?
    Prompt the user as the output indicates above for a number n.
    Write a for loop that loops from 1 to n, printing out the current number each time.
    In the loop, multiply your loop control variable by product.
    Print out your final product.
*
*/
// Declare a new program/class
public class LoopStructures_1
{
    // Define the main function
    public static void main(String[] args)
    {
        // Inside the main, declare a Scanner object
        Scanner input = new Scanner(System.in);
        // Define a variable called product
        int product = 1;
        // Prompt the user as the output indicates above for the number n
        System.out.println("Please enter enter a number to calculate its corresponding factorial: ");
        int n = input.nextInt();
        // Write a for loop that loops from 1 to n, printing out the current number each time.
        for (int i = 1; i <= n; i++)
        {
            // In the loop, multiply your loop control variable by product
            product *= i;
        }
        // print out your final product
        System.out.println(product);
    }
}
