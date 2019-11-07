/*-----------------------------------------------------------------------------------
 * 
 *	sum( n ) is a summation algorithm defined as follows:
 *				
 *	(1)		sum( n ) =  n + (n-1) + (n-2) + ... + 1
 * 	(1a) 	sum( 1 ) = 1
 *
 * and from this definition, we can rewrite this formula in terms of itself, such that:
 *			
 *	(2)	    sum( n ) = n + sum( n - 1 ) 
 *
 * and we can do this again
 *
 *	(3)    	sum( n ) = n + ( n - 1) + sum( n - 2 ) 
 *
 * and so on, and so forth, we finally end up with the same as above
 *
 *	(1)	    sum( n ) = n + (n-1) + (n-2) + ... + 1 
 *
 *----------------------------------------------------------------------------------- */ 
/**
 * @author Patrick O'Brien, Rob Nash
 * @version 11/4/2019
 * */
import java.awt.Dimension;

import javax.swing.*;
	
public class RecursionLab {
	
	private static JTextArea myArea = new JTextArea();
	private static int count = 0;
	
	public static void main( String args[] ) {	//invoke the recursive method here...
		
		/**
		 * TODO: switch between the two commented lines below and execute this code, 
		 * observing the output for both the iterative solution and the recursive solution.
		 * To watch the recursive behaviour in action, set a breakpoint on the if statement
		 * inside the recursiveSum() function
		 *
		 * 1. Summation - experiment with both code paths (iterative and recursive)
		 * --Done
		 */
////		int solution = iterativeSum( 20 );
//		int solution = recursiveSum( 20 );
////		int solution = sumToFactorial(20);
//
//
//		//Some GUI details
//		myArea.setText(("Result is : " + solution + "\n" + myArea.getText()));
//		JScrollPane myPane = new JScrollPane( myArea );
//		myPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//		myPane.setPreferredSize(new Dimension(600,300));
//		JOptionPane.showMessageDialog( null, myPane );
//
//		//good form to include an exit call when GUIing in Java
//		System.exit(0);

		// Testing for the recursive exponent method
		// Main verifies the correct value.
//		int b = 2, e = 2;
//		count = exponentFunction(b, e);
//		System.out.println(count);

		// Testing for the recursive exponent method
		// Main verifies the correct value.
//		int b = 2, e = 5;
//		count = exponentFunctionHalf(b, e);
//		System.out.println(count);

		// Testing for the recursive fibonacci method
//		System.out.println(fibonacci(5));

		// Testing for 5. the N Choose R
		System.out.println(nChooseR(6,15));
	}
	
	
	
	/** recursion is similar to iterative looping, but we
	 *  use method calls to repeat computations (or decompose the problem) 
	 *  instead of explicit looping control structures 
	 */
	public static int recursiveSum( int n ) {
		updateRecursiveDisplay(n);			//overhead for nice output, not required
		if( n == 1)			//if we're at the base case...
			return 1;		//then return the answer to the simplest problem which we know how to solve
		else				//otherwise, we rely on the fact that sum( n ) = n + sum( n - 1 ) and keep recursing
			return ( n + recursiveSum( n - 1) );
	}						//for this method to terminate, we must be breaking the problem down into smaller
							//and smaller problems, until we reach the simplest form of the problem which we know
							//how to solve (in this case, it's the fact that sum( 1 ) == 1 )

	//the iterative counterpart to the above recursion
	//notice how it's longer? At times, an iterative solution may require more code than the recursive counterpart, 
	//but, the recursive solution is slower and more memory intensive.  We can always recast recursion as iteration.
	public static int iterativeSum( int i ) {
		int total = 0;
		
		for( int n = i; n >= 1; n--) {
			updateIterativeDisplay(n);
			total = total + n;
		}
		return total;
	}

	/**
	 * 2. From Summation to Factorial
	 * The definition of the factorial function is defined below. Using the summation code as a guide, write a
	 * very similar recursive method that calculates the factorial of some input n. This method should be like
	 * all recursive functions in that it knows how to solve a trivial case (case1), and the function knows how to
	 * decompose larger cases into smaller cases (case2). Just as for and while loops use a boolean expression
	 * to govern loop termination, so too will we use a boolean condition in combination with an if to control
	 * repetition, as demonstrated here:
	 *
	 * if (case1) {
	 * return base case solution; //for summation, factorials, exponent, and Fibonacci, this is 1
	 * } else (2) {
	 * result = recursive call //typically the recursive call decrements by 1 or n/2
	 * return result;
	 * }
	 * Build this new recursive method and test your code with a short main driver.
	 * */
	public static int sumToFactorial(int n) { // takes some input n
		if (n == 0) {  // case 1
			return 1; // base case is one
		} else { // case 2: else if n is not yet 0
			updateRecursiveDisplay(n); // update
			// return the input n * n - 1 --> run through again until 0
			return n * sumToFactorial(n - 1);
		}
	}

	/**
	 * 3. The exponent function
	 * We will build two recursive functions and roughly compare their
	 * respective performance.Write a method that produces the
	 * result of x^n by observing the following recurrence relationships
	 * (1) x^0 = 1
	 * (2) x^n = x * x^(n-1) when n > 0
	 * Verify by creating a main that tests it.
	 * @param x = base number x
	 * @param n = the exponent that the base (x) is raised to
	 * */
	public static int exponentFunction(int x, int n) { // takes an integer n as power

		if (n == 0) { // if n is equal to the base case, then return
			return 1;
		} else {
			return (x * exponentFunction(x, n - 1));
		}
	}

	/**
	 * In the same class, write another function that will also recursively solve
	 * for exponential values, but will do so by cutting our problem in half at each step
	 * (rather than moving the solution along incrementally by subtracting
	 * one from n at each step.
	 * (1) Defined by x^0 = 1
	 * (2) x^n = (x^(n/2)^2 when n is even
	 * (3) x^n = x * (x^((n-1)/2))^2 when n is odd
	 * */
	public static int exponentFunctionHalf(int x, int n) {
		if (n == 0) {
			return 1;
		}
		// Iterative version
//		else if (n % 2 == 0) { // n is even
//			return (int)(Math.pow(x, n/2 * Math.pow(x, n/2))));
//		} else { // if n is odd
//			double pow = Math.pow(x, ((n - 1) / 2));
//			return (int)(x * pow * pow);
//		}

		// O(N) Recursive version
//		if (!(n % 2 == 0)) { // if n is odd
//			return x * exponentFunctionHalf(x, n / 2) * exponentFunctionHalf(x, n / 2);
//		} else {
//			return exponentFunctionHalf(x, n / 2) * exponentFunctionHalf(x, n / 2);
//		}

		// O(log(n)) Recursive version
		/*
		* 1. The faster one is the O(log(n)) implementation
		* It's faster because it doesn't need to process as
		* much for each recursive call
		* 2.
		* 3. I'm really confused by these questions 2 and 3, they seem
		* out of context
		* */
		int pow = exponentFunctionHalf(x, n / 2);
		if (!(n % 2 == 0)) { // if n is odd
			return x * pow * pow;
		} else { // n is even
			return pow * pow;
		}
	}

	/**
	 * 4. The Fibonacci Numbers
	 * Described by the following recursive relationship
	 * f(0) = 0 and f(1) = 1
	 * f(n) = f(n-1) + f(n-2) for n > 1
	 * produces 112358
	 * */
	public static int fibonacci(int n) {
		if (n == 0 || n == 1) { // if f(0) = 0 and f(1) = 1
			return 1; // return base case
		} else { // f(n) = f(n-1) + f(n-2) for n > 1
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	/**
	 * 5. Combinations or "N Choose R"
	 * C(n, r) = n! / (r! * (n-r)! )
	 * so it's asking if...
	 * Given a method C --> with inputs (n, and r)
	 * it is equal to factorial of n
	 * divided by (the factorial of r * the factorial of (n-r)
	 *
	 * Note: Iterative solution doesn't seem to work
	 * WIP
	 * */
	public static int nChooseR(int n, int r) {
		if (n == 0) {
			return 1; // return base case
		} else {
			// iterative solution
			return sumToFactorial(n) / (sumToFactorial(r) * (sumToFactorial(n) - sumToFactorial(r)));
		}
	}

	public static void updateIterativeDisplay(int n) {
		count++;
		String text = myArea.getText();
		
		text += "\n/*******************Loop iteration " + count + "**************************************";
		text += "\n Calling iterativeSum( int n = " + n +" ). Total += " + n;
		text += "\n***************************************************************************/";
		
		myArea.setText( text );
	}
							
							
	//ignore this method unless interested in the output string						
	public static void updateRecursiveDisplay(int n) {
		
		count++;
		String text = myArea.getText();
		
		
		if( count == 1 )  {
			text += "\n       return ( n + recursiveSum( n - 1 ) ) \n\n";
			text += "       CALL STACK IN MAIN MEMORY                ";
		}
		
		
		text += "\n/*******************Method invocation " + count + "*********************";
		
		
		text += "\n Calling recursiveSum( int n = " + n +" ). ";
		text += "\n The return statement from this function will resolve in " + (n-1) + " more recursive method calls...";
		
		if( n != 1 ) {
			text += "\n The return statement which invokes the recursive call is \"return ( " + n + " + recursiveSum( "+ (n - 1) +" ));";
		} else {
			text += "\n The base case has been hit.  The return statement is \"return 1;\" which is the value returned to the expression above. ";
			text += "\n Notice how hitting the base case will provide a solid, known piece of information from which we will construct more known ";
			text += "\n information by bubbling up through all of the other, yet-to-be-determined return expressions";
		}
		text += "\n***************************************************************************/";
		
		myArea.setText( text );
		
	}
}
	

	
	
	
