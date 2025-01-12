package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		 // Create an ArrayList
        ArrayList<String> cities = new ArrayList<>();

        // Add elements
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Bangalore");

        // Access elements
        System.out.println("First City: " + cities.get(0));

        // Modify elements
        cities.set(1, "Chennai");
        System.out.println("Updated List: " + cities);

        // Remove elements
        cities.remove("Bangalore");
        System.out.println("After Removal: " + cities);

	}

}
