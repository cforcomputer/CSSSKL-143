/**
 * @author Patrick O'Brien
 * Course: CSSSKL 143
 * @project lab 1
 * */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	// Write your code here
        controlStructures();
        arrays();
    }


    public static void controlStructures()
    {
        try{


        PrintWriter printWriter = new PrintWriter(new FileWriter("data.txt"));
        // Print out the first 10 digits
        for (int i = 0; i < 10; i++)
        {
            printWriter.println(i);
        }

        // Print out the first 10 even digits
        for (int i = 0; i < 10; i++)
        {
            if (i % 2 == 0)
            {
                printWriter.println(i);
            }
        }

        // Print the sum of the first 5 numbers entered in the console
        Scanner keys = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        double average = 0;
        int temp = 0;

        printWriter.println("Please enter 5 integers to calculate the sum: \n");
        while (counter != 5)
        {
            temp = keys.nextInt();
            sum += temp;
            counter++;
        }
      printWriter.println("The sum is: " + sum);

        // Average the integers entered in the previous problem, produce a double result
        average = sum / counter;
        System.out.println(average);

        if (average < 60)
        {
            if (average < 0)
            {
                printWriter.println("Something went wrong, the answer is negative!");
            }
            printWriter.println("F");
        }
        else if (average < 70 && average > 60)
        {
            printWriter.println("D");
        }
        else if (average < 80 && average > 70)
        {
            printWriter.println("C");
        }
        else if (average < 90 && average > 80)
        {
            printWriter.println("B");
        }
        else
        {
            printWriter.println("A");
        }

        // Rewrite the above statement as a switch statement, are there any problems with this?
        // ANS: Yes, the problem is that you would need to hardcode each individual step in the grades
        // for each potential average. The switch statement also cannot take doubles.
        switch ((int)(average))
        {
            case 50:
                printWriter.println("F");
            case 60:
                printWriter.println("D");
                break;
            case 70:
                printWriter.println("C");
                break;
            case 80:
                printWriter.println("B");
            case 90:
                printWriter.println("A");
        }
        printWriter.flush();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void arrays()
    {
        // Write a new method and declare an array of integers
        int[] data = {3, 1, -8, 4, -5, 2};
        System.out.println(sum(data));
        System.out.println(index(-5,data));
        System.out.println(posIntSum(data));
        populate(data);
        fileOutput(data);
    }

    // write a separate function to sum the contents of the array
    public static int sum(int[] data)
    {
        int sum = 0;
        for (int i = 0; i < data.length; i++)
        {
            sum += i;
        }
        int average = sum / data.length;
        return average;
    }

    // Write a function to find the index of a specified element
    public static int index(int elem, int[] data)
    {
        for (int i = 0; i < data.length; i++)
        {
            if (elem == data[i])
            {
                return i;
            }
        }
        return 0;
    }

    // Write a function to sum up only positive integers in the array
    public static int posIntSum(int[] data)
    {
        int sum = 0;
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] > 0)
            {
                sum += data[i];
            }
        }
        return sum;
    }

    public static double average(int[] data)
    {
        double sum = sum(data);
        sum = sum / data.length;
        return sum;
    }

    // write a function to populate an int array with the values from console
    public static void populate(int[] data)
    {
        Scanner keys = new Scanner(System.in);
        for (int i = 0; i < data.length; i++)
        {
            System.out.printf("overwrite index " + i + ": ");
            data[i] = keys.nextInt();
        }
        for (int i : data)
        {
            System.out.print(i + ", ");
        }
    }

    // FILE IO
    // Write the contents of the above array [data] to a file separated by a comma
    public static void fileOutput(int[] data)
    {
        try
        {
            PrintWriter printWriter = new PrintWriter(new FileWriter("output.txt"));
            for (int i = 0; i < data.length; i++)
            {
                printWriter.print(data[i] + ", ");
                printWriter.flush();
                System.out.println("Array index " + i +" written to output.txt");
            }

            /**
             * Note: this class sum and average do not work correctly with the input array
             * */
            // Write the sum of the array to file on the next line
            printWriter.println();
            printWriter.println(sum(data));
            System.out.println("Sum written to the next line of output.txt");

            // Write the average of the array to third line of the file
            double average = average(data);
            printWriter.println(average);
            printWriter.flush();
            System.out.println("The average " + average + " has been written to the third line of the file");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

}
