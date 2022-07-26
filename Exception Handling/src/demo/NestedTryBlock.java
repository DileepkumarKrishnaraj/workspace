package demo;

public class NestedTryBlock {

	public static void main(String[] args) {
		try {
			try {
				int res = 30 / 0;
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			try {
				int a[] = new int[6];
				a[5] = 7;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
