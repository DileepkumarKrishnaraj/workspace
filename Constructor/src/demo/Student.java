package demo;

public class Student {
	int id;
	String name;
	
	void Display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		//Default Constructor
		Student s1 = new Student();
		Student s2 = new Student();
		s1.Display();
		s2.Display();

	}

}
