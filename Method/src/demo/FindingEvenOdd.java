package demo;

import java.util.Scanner;

public class FindingEvenOdd {

	public static void main(String[] args) {
		//User-defined method
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		UserdefinedMethod(num);

	}
	public static void UserdefinedMethod(int num){
		if(num % 2 == 0) {
			System.out.println("The given number is even");
		}else {
			System.out.println("The given number is odd");
		}
	}
}
