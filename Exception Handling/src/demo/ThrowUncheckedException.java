package demo;

public class ThrowUncheckedException {
	public static void Validate(int age) {
		if(age > 18) {
			throw new ArithmeticException("He/She has no right to vote");
		}
		else {
			System.out.println("Welcome to Vote");
		}
	}
	public static void main(String[] args) {
		Validate(34);
		System.out.println("xyz");

	}

}
