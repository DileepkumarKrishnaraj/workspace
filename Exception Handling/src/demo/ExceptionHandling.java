package demo;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		int x , y , result = 0;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		try {
			result = x / y;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(result);		

	}

}
