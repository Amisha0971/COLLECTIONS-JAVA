package collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		  // Create a Stack
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Display the stack
        System.out.println("Stack: " + stack);

        // Peek the top element
        System.out.println("Top Element: " + stack.peek());

        // Pop an element (remove the top)
        System.out.println("Popped Element: " + stack.pop());

        // Display the stack after popping
        System.out.println("Stack after pop: " + stack);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Search for an element
        System.out.println("Position of 10: " + stack.search(10));
    }

	}


