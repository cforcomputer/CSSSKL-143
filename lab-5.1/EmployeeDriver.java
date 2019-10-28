import java.util.ArrayList;
/*
 * Driver
 * Lab 
 * 
 * A simple driver to exercise the Employee hierarchy 
 */

public class EmployeeDriver {
	
	
	public static void main(String[] args) {
		Accountant emp1 = new Accountant( "Rick", 123456789);
		//this next employee makes a bit more than Rick
		Accountant emp2 = new Accountant( "Tim", 55555555,10000);
		//and lets make an hourly worker
		HourlyWorker emp3 = new HourlyWorker( "Jim", 11111111);
		//then a salaried worker
		SalariedWorker emp4 = new SalariedWorker( "Jane", 222222222, 5000);
		HourlyWorker emp5 = new HourlyWorker( "Joe", 11111111,20);
		
		//todo: Build some PermanentHire and Consultant objects here
		//and add them to the ArrayList below
		PermanentHire p1 = new PermanentHire("Henry", 654451233);
		PermanentHire p2 = new PermanentHire("Philip", 974564230, 67000);

		// Using the employeeDriver, build a ColorWithAlpha and try to add it to the
		// ArrayList of Employees
		// Q: What error do you encounter?
		/*
		A: It says that the ArrayList cannot be applied to ColorWithAlpha,
		this is likely because when the ArrayList is created, it is declared
		to be ArrayList<Employee>, meaning it is limited to objects of the
		Employee type. So Employee and any of its child classes.
		 */

		Consultant c1 = new Consultant("Kevin", 678940987);
		Consultant c2 = new Consultant("Bacon", 775543998, 34.50);
		ColorWithAlpha color1 = new ColorWithAlpha(210);
		ColorException color2 = new ColorException();
		//and build a set of workers, all of which are employees
		ArrayList<Employee> myEmployees = new ArrayList<Employee>();
		
		myEmployees.add(emp1);
		myEmployees.add(emp2);
		myEmployees.add(emp3);
		myEmployees.add(emp4);
		myEmployees.add(emp5);
		myEmployees.add(p1);
		myEmployees.add(p2);
		//todo: add a sixth and seventh employee to this list that you create
//		myEmployees.add(color1);
		// add consultants
		myEmployees.add(c1);
		myEmployees.add(c2);
//		myEmployees.add(color2);
		// Cannot be applied to ArrayList, if you want to add objects
		// that are not of the Employee class, you need to declare
		// the ArrayList as a general object instead of a specific
		// class object.

		
		//this code doesn't need to change, even if you add 10 new employee classes and 
		//add 102 new employees - this is an example of generic code that can be written 
		//when inheritance hierarchies are in use
		for( int i = 0; i < myEmployees.size(); i++) {
			Employee current = myEmployees.get(i);
			System.out.println( current.getName() + " makes " + current.calculateWeeklyPay() + " per week.");
		}
		
		
	}
}
