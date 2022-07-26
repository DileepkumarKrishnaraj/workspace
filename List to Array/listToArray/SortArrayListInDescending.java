package listToArray;

import java.util.*;

public class SortArrayListInDescending {

	public static void main(String[] args) {
		List <Integer> element = new ArrayList <Integer>();
		element.add(23);
		element.add(45);
		element.add(12);
		element.add(5);
		element.add(76);
		
		Collections.sort(element, Collections.reverseOrder());
		System.out.println("After sorting in Descending Order: " + element);

	}

}
