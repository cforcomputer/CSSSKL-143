import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/**
 * (1) Build a Student Class with only two data items: a String name and a double GPA.
 *
 * */


public class Student2 implements Serializable {
	// String name and double GPA
	private double GPA;
	private String name;
	
	public Student2(String n, double gpa) {
		name = n;
		GPA = gpa;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeObjectToFile();
		Student2 a = readObjectFromFile();
		
		if(a != null) {
			System.out.println(a.toString());
		}
	}

	private static Student2 readObjectFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("data.obj"));
		Student2 one = (Student2) is.readObject();
	
		is.close();
		
		return one;
	}

	private static void writeObjectToFile() throws FileNotFoundException, IOException {
		Student2 nguyen = new Student2("Nguyen", 3.5);

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data.obj"));
		os.writeObject(nguyen);
			
		os.close();		
	}

}
