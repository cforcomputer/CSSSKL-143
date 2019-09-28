import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class usingScanner {
    // Build a main class that will open the text files from the first two programs and output the
    // results of the file to console.
    public static void main(String[] args)
    {
        /*
        * Example:
        *   Which file to view? data1.txt
        *   1*2*3*4*5
        *   120
        */
        String filename = "";
        Scanner input = new Scanner(System.in);

        int choice = 0;
        while (choice != -1)
        {
            System.out.println("Please select a text file to view \n");
            System.out.println("1. data from from data.txt");
            System.out.println("2. data from output.txt");
            System.out.println("-1. Exit the program");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    filename = "data.txt";
                    break;
                case 2:
                    filename = "output.txt";
                    break;
                case 3:
                    return;
                default:
                    System.out.println("That was not one of the choices!");
            }
            try {
                File file = new File(filename);
                Scanner readLine = new Scanner(file);
                while (readLine.hasNext())
                {
                    System.out.println(readLine.next());
                }
                readLine.close();
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }

        }

    }
}
