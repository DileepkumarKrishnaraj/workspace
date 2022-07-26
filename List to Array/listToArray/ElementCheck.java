package listToArray;

import java.util.*;

public class ElementCheck {

	public static void main(String[] args) {
		List<Integer> element = new ArrayList<Integer>();
		element.add(23);
		element.add(76);
		element.add(3);
		element.add(13);
		
		if(element.contains(3))
			System.out.println("The element 3 exists in Array List.");
		else
			System.out.println("The element 3 doesnot exist in Array List.");

	}

}
