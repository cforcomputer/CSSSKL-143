/* 
 * CSS 162 Assert Demo
 * 
 * Usage: This software is configured to crash your program immediately upon execution.
 * If your software doesn't crash, you don't have assertions enabled (use "-ea")
 * in your editor.  Google the name of your editor and "how to enable asserts" or follow
 * the instructions specific to BlueJ or Eclipse in the lab.
 * 
 * Author: Rob Nash
 */

/**
 * Q: Look at the first two asserts in the program, which one is breaking it?
 * A: The second one: assert(false) since it is always asserting false in main.
 * Exception in thread "main" java.lang.AssertionError at AssertDemo.main(AssertDemo.java:22)
 *
 *
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class AssertDemo {
	/* Work on this in a piecewise fashion by uncommenting and focusing on one section at a time
	 * in isolation rather than running everything at once.
	 */
	public static void main(String[] args) {
		assert(true);
//		assert(false);
		
//		warmUpAsserts();
//
//		assertWithPrimitives();
		
		assertWithObjects();
		
		homeworkRelatedAsserts();
	}

	/*
	 * Just a few warm-up asserts here.
	 * Add two new assert() statements after the TODO below
	 */
	private static void warmUpAsserts() {	
			assert( 5 > 1 );
			
			int a = 30;
			assert(a != 0);
	
			assert(null == null);	  //could this ever be false?
			assert(true == true);	  //a bad day indeed if this could be false
			//TODO: craft two more asserts and place them here.  If they're false, they'll crash the program.
		assert(a != 1);
		assert(a == a);
	}

	/*
	 * Using asserts in conjunction with primitive types is familiar to you;
	 * just as in a loop or if, you want to form a true/false (boolean) expression
	 * by employing the relational operators.
	 */
	private static void assertWithPrimitives() {
		//assert below to ensure a Fraction's denominator is never 0
		Scanner keys = new Scanner(System.in);
		System.out.println("Enter an integer numerator:");
		int num = keys.nextInt();
				
		System.out.println("Enter an int denominator, not 0:");
		int denom = keys.nextInt();
				
		assert(denom != 0);
	
		//assert that all ArrayLists start empty
		ArrayList<String> emptyList = new ArrayList<String>();
		assert(emptyList.size() == 0);
		//TODO: build two more asserts that use primitives and relational operators here
		assert(num == denom);
		assert(denom < 0);
	}
	
	/*
	 * Asserts work with both primitives and objects.  Just as you 
	 * use "==" with primitives and ".equals()" with objects, so too 
	 * will you use ".equals()" in asserts that deal with object equality. 
	 */
	private static void assertWithObjects() {
		AssertDemo ad = new AssertDemo();
		// Q: Find the checkAddress() function and explain in the comments what it does
		// A: It calls the checkAddress method with a new AssertDemo class as the object input
		//
		// Q: To what address does "this" map to?
		// A: :AssertDemo@52cc8049
		//
		// Q: To what address does "input" map to?
		// A: :AssertDemo@52cc8049
		// Q: What does this mean?
		// A: It refers the memory reference location for where the class object is stored. The memory location
		// is the place that contains all the runtime information from the various functions like variables, etc.

		ad.checkAddress(ad);		
		//guess what .equals() does if you don't create one yourself? (hint ==)
		assert( ad.equals(ad) );  
		//TODO: make a few objects from any previous lab and test them with assert
		//example: make two Point objects at the origin and assert they are equal
		//assert(p1.equals(p2);  //example
		AssertDemo ad2 = new AssertDemo();
		ad2.equals(ad);
		assert(ad2 != ad);

		AssertDemo ad3 = new AssertDemo();
		assert(ad3.equals(ad2));
		// How should we test immutable objects? How is this similar to primitives?
		// You should test immutable objects through comparison methods like .equals() or .compareTo()
		// since they will take the information inside the object and compare it, otherwise if you use
		// boolean comparisons, you're just checking to see if the memory locations are the same or not.
	}


	/*
	 * This function compares the address at "this" to the address of the object handed 
	 * into the function.
	 */
	public void checkAddress(Object input) {
		System.out.println("Address of this :" + this);
		System.out.println("Address of input:" + input);
		//how many aliases for the one "new" object created in main exist in this scope? 
		//1? 2? 3? Which are they?
		assert(this == input);  //== does an address check for objects, which is frequently NOT what we want
	}

	/*	
	 * Asserts are a useful tool for transforming postconditions and class invariants into code.
	 * Lets build a few asserts that work with your current Bill & Money assignment.
	 * Change the value of paidDate and cents to trip the asserts and observe the asserted error message. 
	 */
	private static void homeworkRelatedAsserts() {
		Object paidDate = new Object();  //really, a Date 
		assert( paidDate != null);  	 //perhaps one rule is that paidDate shouldn't be null after calling setPaidDate()
		int cents = 0;
		assert( cents >= 0 && cents <=99);  //another class invariant is written as an assert here.
		//TODO: craft 2 more asserts that you could use with any assignment
		assert(cents < 0);
		Debug deb = new Debug();
		assert(deb.dmode != true);
	}

	/*
	* REFLECTION AND ANALYSIS QUESTIONS
	* 1. What technique do you prefer?
	* A: I like the traditional debugger with the line breaks since it's really simple to make a break and then
	* step through the logic of the problem to see what's wrong. Ideally of course, I think there should be a
	* combination of both techniques, since asserts can be just as valuable when working in tandem with the debugger.
	*
	* 2. Are some debugging techniques more (or less) appropriate for longer programs?
	* A: Since asserts have an effect on runtime, it should be reasoned that it would be less appropriate to use
	* them in larger or more demanding applications where runtime is a concern. Therefore traditional debuggers
	* and test cases would be better for larger programs.
	*
	* 3. What are some advantages to using a debugger with a GUI?
	* A: It's can visually show you the values of variables and which lines they're executing from inside the
	* actual code. It separates the values into easily recognizable patterns and tables where you can
	* more intuitively recognize what is going wrong.
	* Q: What can you inspect here that you couldn't when just printing to the console?
	* A: The current values of different variables, how they're assigned and when.
	*
	* 4. How can proper documentation help in finding and avoiding bugs?
	* A: It thoroughly explains what is going on in each method. This will help other people reading your code
	* to see where and how the different methods interact with one another. So devs will know that if they change
	* one thing, it will affect x thing. It will also help them understand what is going on in general, so
	* that they don't edit something incorrectly and create a logic error or related bug.
	* */
}
