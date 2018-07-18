package com.cam.datastructure.linkedlist;

import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		//adding elements from a list
		LinkedList<String> list = new LinkedList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(2,"F");
		System.out.println("LinkedList Contents: " + list);
		
		
		//removing elements from a list
		list.remove(1);
		list.remove("A");
		list.removeFirst();
		list.removeFirstOccurrence("E");
		list.removeLast();
		System.out.println("LinkedList Contents after a few deletions: " + list);
		
		

		
		

		
		
	}

}
