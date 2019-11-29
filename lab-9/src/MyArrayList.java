import java.util.Random;

/**
 * This class implements multiple sort algorithms to be used with ints, chars, and Stings.
 * Bubble sort, Selection sort, and Insertion sorts are implemented here
 *
 * @author Patrick O'Brien
 * @version 11/25/2019
 */

public class MyArrayList implements Comparable<MyArrayList>{

    // instance data
    protected int[] IntList;
    protected char[] CharList;
    protected String[] StringList;

     // constructor will build all 3 arrays here
    public MyArrayList() {
        this.IntList = new int[10];
        this.CharList = new char[10];
        this.StringList = new String[5];

        // fill all 3 arrays with data
        for(int i = 0; i < IntList.length; i++) {
            IntList[i] = (int) (Math.random()*52);
       }

       // Populate char array
       for(int i = 0; i < CharList.length; i++) {

          Random random = new Random();
          CharList[i] = (char)(random.nextInt(26) + 'a');
       }

       // Populate String array
       StringList[0] = "joe";
       StringList[1] = "mark";
       StringList[2] = "abbey";
       StringList[3] = "tony";
       StringList[4] = "kevin";
    }

    /**
     * compareTo override method
     * -1 = means the list being compared is greater than the current list
     * 1 = the current list is greater than the list being compared
     * 0 = the current array is not equal to the list being compared against
     * */
    public int compareTo(MyArrayList other) {
        if (this.IntList[0] < other.IntList[0]) {
            // your code here
            System.out.println("compareTo() is returning -1, array[0] < other[0]");
            return -1;
        }

        if (this.IntList[0] > other.IntList[0]) {
            // your code here
            System.out.println("compareTo() is returning 1, array[0] > other[0]");

            return 1;
        }

        else {
            System.out.println("compareTo() is returning 0, array[0] != other[0] ");
            // return a value here
            return 0;
        }

    }


    /**
     * Declare a method called inBubbleSort()
     * Note that MyArrayList has 3 arrays as class fields
     * inBubbleSort() needs no input, as list is instance data
     * ----
     * implement a helper method called public void swapInts(int[] intList, int j)
     * to --> call from intBubbleSort() to swap elements for you.
     * */
    public void intBubbleSort() {
     // Implement your sort, call a helper swap method
        int n = IntList.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (IntList[j] > IntList[j+1]) {
                    swapInts(IntList, j);
                }
            }
        }
    }

    /**
     * Char version of BubbleSort
     * */
    public void CharBubbleSort() {
       // Implement your sort, call a helper swap method
        int n = CharList.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (CharList[j] > CharList[j+1]) {
                    swapChars(CharList, j);
                }
            }
        }
    }

    /**
     * String version of BubbleSort
     * */
    public void stringBubbleSort() {
       // Implement your sort, call a helper swap method
        int n = StringList.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (StringList[j].length() > StringList[j+1].length()) {
                    /*
                    If we are only sorting by the length of strings, we can reuse the
                    logic present in the swapChars and swapInt methods
                     */
                    swapStrings(StringList, j);
                }
            }
        }
    }


    /**
     * Helper method for intBubbleSort()
     * @param intList = int array
     * @param j = int
     * */
    public void swapInts(int[] intList, int j) {
       // code for swapping ints
        int temp = intList[j];
        intList[j] = intList[j+1];
        intList[j+1] = temp;
    }

    /**
     * BubbleSort swap for char array
     * @param charList = char array
     * @param j = int
     * */
    public void swapChars(char[] charList, int j) {
        // code for swapping chars
        char temp = charList[j];
        charList[j] = charList[j+1];
        charList[j+1] = temp;
    }

    /**
     * BubbleSort swap for string array
     * @param stringList = the string array
     * */
    public void swapStrings(String[] stringList, int j) {
        // code for swapping Strings
        String temp = stringList[j];
        stringList[j] = stringList[j+1];
        stringList[j+1] = temp;
    }

    //selection sort for ints
    public void selectionSort() {
        // Implement your sort, call swapSelection(int[] intList, int i, int nextMin)
        int n = IntList.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (IntList[j] < IntList[min]) {
                    min = j;
                }
                swapSelection(IntList, i, min);
            }
        }
    }

    /**
     * Selection sort for strings
     * */
    public void stringSelectionSort() {
       // Implement your sort, call swapSelectionStrings(String[] StringList, int i)
        int n = StringList.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (StringList[j].compareTo(StringList[min]) < 0) {
                    min = j;
                }
                swapSelectionStrings(StringList, i, min);
                // and findSmallest(IntList, i, IntList.length) from your method
                findSmallest(IntList, i, n);
            }

        }

    }

    /**
     * This method is used by the int selectionSort
     * @param intList = int array
     * @param i = int
     * @param nextMin = int
     * */
    public void swapSelection(int[] intList, int i, int nextMin) {
        // Your code here to swap int values
        int temp = intList[nextMin];
        IntList[nextMin] = IntList[i];
        IntList[i] = temp;
    }

    /**
     * this method is used by stringSelectionSort to swap the
     * values in the array.
     * @param StringList = the string array
     * @param i = int
     * @param min = int
     * */
    public void swapSelectionStrings(String[] StringList, int i, int min) {
         // Your code here to swap values
        String temp = StringList[i];
        StringList[i] = StringList[min];
        StringList[min] = temp;
    }


    /**
     * Find smallest method, finds the smallest in an int array
     * @param arr = int array
     * @param begin = int
     * @param end = int
     * */
    public int findSmallest(int[] arr, int begin, int end) {
        //returns the index of the smallest element
        int minIndex = begin;       //hint
        for(int i = begin; i < end ; i++) {
            if(arr[begin - 1] < arr[begin]) {
                minIndex = begin;
            } else
                minIndex = begin - 1;
        }
        return minIndex;
    }

    /**
     * Insertion sort method
     * Modify the demo code
     * --> implemented imperative solution
     * */
    public void insertionSort() {

//		for(int i = 0; i < IntList.length - 1; i++) {
//            //note -1 above since we?re dealing with neighbors (a, a+1)
//            int current = IntList[i];
//            //int hole = i;
//
//            while( i > 0 && IntList[i - 1] > current ) { //while ?out of place?
//                //slide data to the left moving the ?hole? left
//                // more code goes here
//                IntList[]
//            }
//        }
        for (int i = 1; i < IntList.length; i++) {
            int k = IntList[i];
            int j = i - 1;
            while (j >= 0 && IntList[j] > k) {
                IntList[j + 1] = IntList[j];
                j -= 1;
            }
            IntList[j + 1] = k;
        }
    }
}




