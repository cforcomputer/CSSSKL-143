import java.util.Scanner;
/**
 * @author Patrick O'Brien
 * Course: CSSSKL 143
 * @project lab 1
 * */
public class SelectionControlStructures
{
    // Make a new program and define main
    // determine if the number n is evenly divisible by divisor d
    public static void main(String[] args)
    {
        // Define a scanner object and ask the user for number n
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer (n): ");
        int n = input.nextInt();
        input.close();

        // Build an if statement to handle cases such as 0, 1, or > 1
        System.out.println("The divisors are: ");

        if (n == 0 || n == 1)
        {
            return;
        }
        else
        {
            for (int i = 1; i <= n / 2; i++)
            {
                if (n % i == 0)
                {
                    System.out.print(i + " ");
                }
            }
        }

    }
}
