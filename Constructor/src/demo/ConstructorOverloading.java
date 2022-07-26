package demo;

public class ConstructorOverloading {
	int id;
	String name;
	int age;
	
	public ConstructorOverloading(int i, String n) {
		id = i;
		name = n;
	}
	
	public ConstructorOverloading(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	
	void Display(){
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String[] args) {
		ConstructorOverloading c1 = new ConstructorOverloading(12, "Dileepkumar", 21);
		ConstructorOverloading c2 = new ConstructorOverloading(21, "Karthick", 22);
		c1.Display();
		c2.Display();

	}

}
