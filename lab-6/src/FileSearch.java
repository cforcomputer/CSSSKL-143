import java.io.File;
import java.util.Objects;

/**
 * Psuedocode refinement
 * Stepwise refinement
 * File Search 1.0
 * File Search 2.0
 *
 * @author Patrick O'Brien
 * @version 11/4/2019
 *
 * Stepwise Refinement Step N
 * while (more directories to examine) {
 *     Get a directory
 *
 *     If a file, check for match
 *
 *     If a directory,
 *      for (each file and directory in the directory) {
 *
 *          if a file, check for a match and return if found
 *
 *          if a directory, save this in a structure
 *      }
 * }
 *  return if not found
 * */

public class FileSearch {

    /**
     * Driver method
     * */
    public static void main(String[] args) {
        // Search absolute paths for target file --> ex: hello.txt
        // Driver test for searchFilesV2
        System.out.println(searchFilesV2(new File("C:\\Users\\Pat\\Desktop\\" +
                "CSSSKL-143\\lab-6\\src\\test-direct"), "hello.txt"));
        // Driver test for searchFilesV1
        System.out.println(searchFiles(new File("C:\\Users\\Pat\\Desktop\\" +
                "CSSSKL-143\\lab-6\\src\\test-direct"), "hello.txt"));
    }

    /**
     * SearchFiles method V2
     * @param file = directory name
     * @param target = the file name
     * */
    public static String searchFilesV2(File file, String target) {

        while (file.isDirectory()) { // while there are more directories to examine
            // Get a directory
            System.out.println("\nCurrently searching: " + file.getAbsoluteFile());
            // if a file, check for a match
            if (file.canRead()) {
                // non-null is required to avoid a nullpointerexception
                for (File temp: Objects.requireNonNull(file.listFiles())) {
                    if (temp.isDirectory()) {
                        searchFiles(file, target); // call self to move to next directory
                    } else {
                        // If we find the file in question, add it to a string and return
                        if (target.equalsIgnoreCase(temp.getName().toLowerCase())) {
                            return "\nFile Found at:\n" + temp.getAbsoluteFile().toString();
                        }
                    }
                }
            }
        }
        return "Not found";
    }

    /**
     * SearchFiles method V1
     * Build a recursive linear search following the psuedocode you have refined to this point,
     * or using the starter pseudocode approach below.
     *
     * public static String searchFiles(File path, String target) {
     * check if path is actually a dir, abort if not
     * loop over all files & dirs in the current directory
     * if a file, check for a match and return if found
     * if a directory, repeat these steps
     * if found in the directory, return found
     * return “Not found”; //if we made it here, we didn’t find it
     * }
     * @param path = the directory path to be searched
     * @param target = the file name we are looking for
     * */
    public static String searchFiles(File path, String target) {
        while (path.isDirectory()) { // while there are more directories to examine
            // Get a directory
            System.out.println("\nCurrently searching: " + path.getAbsoluteFile());
            // if a file, check for a match
            if (path.canRead()) {
                for (File temp : Objects.requireNonNull(path.listFiles())) {
                        if (target.equalsIgnoreCase(temp.getName().toLowerCase())) {
                            return "\nFile Found at:\n" + temp.getAbsoluteFile().toString();
                        }
                    }

                }
            }
        return "Could not find the file";
    }
}