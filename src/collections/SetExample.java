package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		 // Create a HashSet
        Set<String> animals = new HashSet<>();

        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");

        // Attempt to add a duplicate
        animals.add("Dog");

        // Iterate through the set
        System.out.println("Animals: ");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // Check if an element exists
        System.out.println("Contains 'Cat': " + animals.contains("Cat"));
    }

}
