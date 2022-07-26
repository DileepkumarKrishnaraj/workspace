package BasicSet;

import java.util.*;

public class BasicSet {

	public static void main(String[] args) {
		Set<Integer> data = new LinkedHashSet<Integer>();
		data.add(43);
		data.add(23);
		data.add(4);
		data.add(43);
		data.add(43);
		System.out.println(data);
	}

}
