package logical_programs;

import java.util.LinkedList;

import java.util.Queue;

public class ImplementStackInQueue

{

	Queue<Integer> queueObject = new LinkedList<Integer>();

	void push(int val)

	{

		int size = queueObject.size();

		// Add current element

		queueObject.add(val);

		// Pop (or Dequeue) all previous

		// elements and put them after current

		// element

		for (int i = 0; i < size; i++)

		{

			// this will add front element into

			// rear of queue

			int x = queueObject.remove();

			queueObject.add(x);

		}

	}

	// Removes the top element

	int pop()

	{

		if (queueObject.isEmpty())

		{

			System.out.println("No elements");

			return -1;

		}

		int x = queueObject.remove();

		return x;

	}

	// Returns top of stack

	int top()

	{

		if (queueObject.isEmpty())

			return -1;

		return queueObject.peek();

	}

	// Returns true if Stack is empty else false

	boolean isEmpty()

	{

		return queueObject.isEmpty();

	}

	// Driver program to test above methods

	public static void main(String[] args)

	{

		ImplementStackInQueue s = new ImplementStackInQueue();

		s.push(30); // Inserted in Stack at position 0

		s.push(40); // Inserted in Stack at position 1

		s.pop(); // Removed 40 from stack and stack is having only value 30

		s.push(50); // Inserted in Stack at position 2 ,, now stack is having 50
					// & 30

		s.pop(); // Removed 50 from stack and stack is having only value 30

		System.out.println("Top element :" + s.top()); // will print the top
														// element of stack i.e.
														// 30

	}

}