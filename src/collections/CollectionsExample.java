package collections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		 // Create a List
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);

        // Sort the list
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        // Search for an element (binary search)
        int index = Collections.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);

        // Reverse the list
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        // Find max and min
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Max: " + max + ", Min: " + min);

        // Shuffle the list
        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);
	}

}
