package structural.adapter;

import java.util.Arrays;
import java.util.List;

public class SimpleListExample {
	public void testListAdapter() {
	    // Adaptee
		Integer[] arrayOfInts = { 42, 43, 44 };
		
		/*
		 * Here we are adapting the old array, that might be used elsewhere in the code too. That is why
		 * we are not just changing the type of the array, but we are using Arrays.asList to adapt it to
		 * a method or operations which requires it. Also...the array could be the result to some legacy
		 * method which cannot be changed, so we have the option to ADAPT it to the new code.
		 */
		// Arrays.asList - Adaptor
		// List<Integer> - Target
		List<Integer> listOfInts = Arrays.asList(arrayOfInts);
		
		// Do something with the list, pass it to method that requires a list to work, etc.
		
		System.out.println(arrayOfInts);
		System.out.println(listOfInts);
	}
}
