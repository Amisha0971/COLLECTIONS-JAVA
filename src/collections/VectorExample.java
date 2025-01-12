package collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		  Vector<String> vector = new Vector<>();

	        // Add elements
	        vector.add("Java");
	        vector.add("Python");
	        vector.add("C++");

	        // Insert an element at a specific position
	        vector.add(1, "JavaScript");

	        // Display all elements
	        System.out.println("Vector: " + vector);

	        // Access an element by index
	        System.out.println("Element at index 2: " + vector.get(2));

	        // Remove an element
	        vector.remove("Python");
	        System.out.println("After Removal: " + vector);

	        // Check if an element exists
	        System.out.println("Contains 'Java': " + vector.contains("Java"));

	        // Get the size of the Vector
	        System.out.println("Size of Vector: " + vector.size());
	}

}
