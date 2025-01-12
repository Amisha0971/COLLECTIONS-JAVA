package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {

	public static void main(String[] args) {
		 // Create a Collection (using ArrayList)
        Collection<String> languages = new ArrayList<>();

        // Add elements
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        // Display elements
        System.out.println("Languages: " + languages);

        // Check if a specific element exists
        System.out.println("Contains 'Java': " + languages.contains("Java"));

        // Remove an element
        languages.remove("C++");
        System.out.println("After removing 'C++': " + languages);

        // Size of the collection
        System.out.println("Size: " + languages.size());

        // Clear the collection
        languages.clear();
        System.out.println("Is collection empty? " + languages.isEmpty());
	}

}
