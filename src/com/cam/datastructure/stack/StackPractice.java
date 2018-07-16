package com.cam.datastructure.stack;

import java.util.Stack;

public class StackPractice {

	// pushing an element to the top of the stack
	static void stack_push(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			stack.push(i);
		}
	}

	// popping the element on the top of the stack off
	static void stack_pop(Stack<Integer> stack) {
		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y + " : POP");

		}
	}

	// check what is on the top of the stack
	static void stack_peep(Stack<Integer> stack) {
		Integer element = (Integer) stack.peek();
		System.out.println("Element on stack top: " + element);
	}

	static void stack_search(Stack<Integer> stack, int element) {
		Integer pos = (Integer) stack.search(element);

		if (pos == -1) {
			System.out.println("Element not found");

		} else {
			System.out.println("Element is found at position: " + pos);
		}
	}

	public static void main(String[] args) {
		Stack<Integer> testStack = new Stack<Integer>();

		// adds four numbers to the stack
		stack_push(testStack);
		// pops four elements off of the stack
		stack_pop(testStack);
		// put four elements back on the stack
		stack_push(testStack);
		// Find out what element is on the top of the stack
		stack_peep(testStack);

		// Search for a specific item on the stack
		stack_search(testStack, 1);

	}
}

