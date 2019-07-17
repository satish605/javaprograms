// Java code for Linked List implementation 

import java.util.*; 

public class LinkedListImp
{ 
	public static void main(String args[]) 
	{ 
		LinkedList<String> object = new LinkedList<String>(); 
		object.add("A"); 
		object.add("B"); 
		object.addLast("C"); 
		object.addFirst("D"); 
		object.add(2, "E"); 
		object.add("F"); 
		object.add("G"); 
		System.out.println("Linked list : " + object);
		
	} 
} 
