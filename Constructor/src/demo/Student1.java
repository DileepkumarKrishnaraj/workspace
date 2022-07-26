package demo;

public class Student1 {
	int id;
	String name;
	Student1(int i, String n){
		id = i;
		name = n;
	}
	void Display(){
		System.out.println(id + " " + name);
	}
	
	public static void main(String[] args) {
		Student1 s1 = new Student1(12, "Dileepkumar");
		Student1 s2 = new Student1(12, "Dileepkumar");
		s1.Display();
		s2.Display();

	}

}
