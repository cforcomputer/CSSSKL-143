/**
 * @author Patrick O'Brien
 * @version 1.0
 * 10/07/2019
 * Class design - IntList
 * */
public class IntList {   //or CharList, caps at 100 elements with no bullet-proofing or bounds checks, etc.
 	private int numElements = 0; // Declare an integer called numElements, make private, set to zero
 	private int[] data = new int[100]; // Declare an integer array called "data"

 	public void add(int n) {
 		data[numElements++] = n; // add value n  to array and add 1 to numElements
 	}

 	public String toString() {
 		String retVal = "";
		// in a loop, append all the elements in our data array to this string, separated by a comma
 		for(int i = 0; i < numElements; i++) {
 			retVal += data[i] + ", ";
 		}
 		return retVal;
 	}

 	public int sum()
	{
		int sum = 0;
		// use class level data array
		for (int i = 0; i < data.length; i++)
		{
			sum += data[i];
		}
		return sum;
	}

	public int indexOf(int target)
	{
		for (int i = 0; i < data.length; i++)
		{
			if (data[i] == target)
			{
				// return true if found
				return 1;
			}
		}
		// return false if not
		return -1;
	}

 	//main goes here from the lab
	// Do you see the output for each integer added to the list?
	public static void main(String[] args) {
		IntList a = new IntList();
		a.add(95); a.add(100); a.add(58);
		System.out.println(a.toString() );
		System.out.println(a.sum() );
		System.out.println(a.indexOf(100)); //uncomment these to work on next
		System.out.println(a.indexOf(20));
		//System.out.println(a.save() );
	}
}
