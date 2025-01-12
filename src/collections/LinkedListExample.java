package collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		// Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Add elements at specific positions
        fruits.addFirst("Mango");
        fruits.addLast("Grapes");

        // Access elements
        System.out.println("First Fruit: " + fruits.getFirst());
        System.out.println("Last Fruit: " + fruits.getLast());

        // Remove elements
        fruits.removeFirst();
        fruits.removeLast();
        System.out.println("After Removal: " + fruits);
    }
	}


