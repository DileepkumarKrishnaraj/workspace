package listToArray;

import java.util.*;

public class ConvertListToArray {

	public static void main(String[] args) {
		List<String> names = new LinkedList<String>();
		names.add("Dileep");
		names.add("Kalai");
		names.add("Yamini");
		names.add("Nitheesh");
		names.add("Ranjith");
		String[] array = names.toArray(new String[0]);
		
		for(int i = 1; i < array.length; i++) {
			System.out.println((i) + " element of array is " + array[i]);
		}

	}

}
