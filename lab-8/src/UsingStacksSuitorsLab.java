import java.util.LinkedList;
import java.util.Queue;

/* CSSSKL 162
 *
 * UsingStacksSuitorsLab
 *
 * This class is mostly a driver for playing with Strings as palindromes,
 * both iteratively and recursively.  The UsingStacksSuitorsLab class itself is
 * a runnable object, so it can be passed to a thread in our Queue demo
 *
 *
 */

public class UsingStacksSuitorsLab implements Runnable {
	private static int threadCount = 0;
	private String name;

	public UsingStacksSuitorsLab() {
		name = "#" + threadCount++ + "Thread";
	}

	public static void main(String[] args) throws Exception {
		String s1 = "food";		    //not a palindrome
		String s2 = "racecar";      //a palindrome

		System.out.println("String1 is \"" + s1 + "\"");
		System.out.println("String2 is \"" + s2 + "\"");

	    System.out.println(s1 + " reversed is: ");
		printReverse(s1);
		System.out.println(s2 + " reversed is: ");
		printReverse(s2);

	    recPrintReverse(s1);
		System.out.println();
		recPrintReverse(s2);
		System.out.println();

		System.out.println(s1 + " is a palindrome: " + isPalindrome(s1));
		System.out.println(s2 + " is a palindrome: " + isPalindrome(s2));
/*
		System.out.println(s1 + " is a palindrome(recursively): " + isPalindromeRec(s1));
		System.out.println(s2 + " is a palindrome(recursively): " + isPalindromeRec(s2));

		System.out.println("Did we build a Queue of Threads and start them? " + buildThreadQueue());

		int n = 6;
		System.out.println("For " + n + " suitors, stand in place:" + findPlaceToStand(n));

		n = 10;
		System.out.println("For " + n + " suitors, stand in place:" + findPlaceToStand(n));*/
	}



    /** write a loop that iterates over the input string
     *  In the loop, push each char from the input string on the stack
     * @param target
     * @throws Exception
     */
	public static void printReverse(String target) throws Exception {
		//todo: use a stack
        Stack<Integer> foo = new Stack<>();

        int i = target.length() - 1;
        while (i >= 0) {
            System.out.print(target.charAt(i));
            foo.push(target.charAt(i));
            i--;
        }
        System.out.println();
	}

	/**
     * Write recursive version of printReverse
     * */
	public static void recPrintReverse(String target) {
		//todo
        int i = target.length() - 1;
        if (target.length() == 0) {
            return;
        }
        else {
            System.out.print(target.charAt(target.length() - 1));
            recPrintReverse(target.substring(0, target.length() - 1));
        }
	}
//
	public static boolean isPalindrome(String input) throws Exception {
		//todo: use a stack
        Stack<Integer> oof = new Stack<>();
        int i = 0;
        while (i < input.length()) {
            oof.push(input.charAt(i));
        }

        Stack<Integer> oof2 = new Stack<>();

		while(oof.size() >= 0) {
			oof2.push(oof);
			oof.pop();
		}
		return oof.equals(oof2);
	}
//
//	public static boolean isPalindromeRec(String sentence)	{
//	  	//todo
//	}
//
//	public static int findPlaceToStand(int numSuitors) {
//		//todo
//		return -1;
//	}


//	public static boolean buildThreadQueue() {	//returns true upon success
//		Queue<Thread> q = new LinkedList<Thread>();
//
//		//when our program starts up, it might create multiple threads to use
//		q.enqueue( new Thread(new UsingStacksSuitorsLab()));
//		q.enqueue( new Thread(new UsingStacksSuitorsLab()));
//		q.enqueue( new Thread(new UsingStacksSuitorsLab()));
//
//		System.out.println("Initial Thread order:");
//		q.toString();
//
//		//We need to iterate over our pool of threads and call start() on each one
//		//Make a loop that dequeues a thread, calls start on it, and //enqueues it again
//		//to do:
//		//current = get a thread
//		//current.start();
//		//put the thread back
//
//		System.out.println("Thread order after start()ing:");
//		q.toString();
//
//		return true;  //on successful start
//	}
//
//
//	/*
//	 * No need to edit anything below here,
//	 * unless you'd like to change the
//	 * behaviour of each thread in the thread pool above
//	 */

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println(name + ": " + i + "th iteration");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				//do nothing here
			}
		}
	}
}
