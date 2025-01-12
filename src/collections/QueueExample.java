package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		 // Create a Queue
        Queue<String> orders = new LinkedList<>();

        // Add elements
        orders.add("Order1");
        orders.add("Order2");
        orders.add("Order3");

        // Access the front element
        System.out.println("First Order: " + orders.peek());

        // Process elements (FIFO)
        System.out.println("Processing: " + orders.poll());
        System.out.println("Queue After Processing: " + orders);

        // Add another element
        orders.add("Order4");
        System.out.println("Updated Queue: " + orders);
	}

}
