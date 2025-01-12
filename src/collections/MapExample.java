package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		 // Create a Map using HashMap
        Map<String, String> capitalCities = new HashMap<>();

        // Add key-value pairs to the Map
        capitalCities.put("India", "New Delhi");
        capitalCities.put("USA", "Washington, D.C.");
        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("France", "Paris");

        // Display the entire Map
        System.out.println("Capital Cities: " + capitalCities);

        // Access a value using its key
        String capitalOfIndia = capitalCities.get("India");
        System.out.println("Capital of India: " + capitalOfIndia);

        // Check if a key exists
        if (capitalCities.containsKey("USA")) {
            System.out.println("The capital of USA is: " + capitalCities.get("USA"));
        }

        // Remove a key-value pair
        capitalCities.remove("Japan");
        System.out.println("After removing Japan: " + capitalCities);

        // Get the size of the Map
        System.out.println("Size of the Map: " + capitalCities.size());

        // Iterate through the Map using keySet()
        System.out.println("Iterating through the Map:");
        for (String country : capitalCities.keySet()) {
            System.out.println(country + " -> " + capitalCities.get(country));
        }

}
}
