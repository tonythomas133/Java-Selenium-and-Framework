package day10;

import java.util.LinkedList;
import java.util.Vector;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> empname = new LinkedList<String>(); //all the values are linked by the address of the previous element   this enables insertion and deletion
		empname.add("Sachin");
		empname.add("Tony");
		empname.add("Bipin");
		empname.add("Ajas");
		System.out.println("Linked list is .... " + empname);
		
		empname.removeFirst();
		System.out.println("linked List is " + empname);
		empname.removeLast();
		System.out.println("linked list is " + empname);
		empname.addFirst("Rahul");
		System.out.println("linked list is " + empname);
		empname.addLast("Yacko");
		System.out.println("linked list is " + empname);
		empname.set(3, "john");
		System.out.println("linked list is " + empname);
		
		
		
		//vector
		Vector<String> empdep=new Vector<String>(3);   //poor performance  when the 4th entry is added to the vector additional 3 locations are added  .high security. its synchronized meaning no dupilcates
		Vector<String> empdep=new Vector<String>(3,5);  //initially 3 elements can be added , after which when it exceeds  3 elements additionally 5 elements will be added to the vector, this is considered a legacy collector
	}

}
