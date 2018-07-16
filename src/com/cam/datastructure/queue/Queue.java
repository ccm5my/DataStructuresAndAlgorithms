package com.cam.datastructure.queue;

public class Queue {
	private int front, rear, size;
	private int capacity;
	private int array[];

	// front of the queue is
	public Queue(int capacity) {
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}

	public boolean isFull(Queue queue) {
		return queue.size == queue.capacity;
		// no more positions left in the queue
	}

	public boolean isEmpty(Queue queue) {
		return queue.size == 0 ? true : false;

	}

	public void enqueue(int item) {
		// add an item/person to the queue
		if (isFull(this)) {
			return;
		}
		
		
		System.out.println("rearPlusOne is " + (this.rear+1));
		System.out.println("Capacity is "+this.capacity);
		System.out.println("Remainder between:" +  ((this.rear+1)%this.capacity));
		this.rear = (this.rear + 1) % this.capacity;
		// rear spot = the remainder of (rear position + 1/capacity)
		// situation
		// set the capacity to 3
		// front = 3
		// rear = 2

		// enqueue operation
		// rear spot = remainder of
		System.out.println("Rear: " + this.rear);

		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + "  Enqueued to queue");

	}

	// removes something from the queue
	public int dequeue() {
		if (isEmpty(this)) {
			return -1;
		}
		int item = this.array[this.front];
		this.front = (this.front + 1) % this.capacity;
		System.out.println(front);
		this.size = this.size - 1;
		return item;

	}

	public int rear() {
		if (isEmpty(this)) {
			return -1;
		}
		return this.array[this.rear];
	}
	
	public static void main(String[] args) {
		
		Queue queue = new Queue(1000);
		
		queue.enqueue(10);
		
		queue.enqueue(20);
		
		queue.enqueue(30);
		
		queue.enqueue(40);
		
		
		/////////////////////////
		
		queue.dequeue();
		System.out.println("Rear location after dequeue:" + queue.rear());
		
		queue.dequeue();
		System.out.println("Rear location after dequeue:" + queue.rear());
	}
}
