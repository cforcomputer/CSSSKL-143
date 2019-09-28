/**
 * @author Patrick O'Brien
 * Course: CSSSKL 143
 * @project lab 1
 * */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

// File IO part 3
public class FileReader
{
    public static void main(String[] args)
    {
        try
        {
            FileInputStream fileInput = new FileInputStream("output.txt");
            Scanner readLine = new Scanner(fileInput);

            while (readLine.hasNext())
            {
                System.out.println(readLine.next());
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
