package day10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class collections {

	public static void main(String[] args) {
		// ArrayList dynamic array, duplicate values can be added unlike arrays   high performance     ... best for searching and sorting
		ArrayList<String> empname=new ArrayList<String>();
		ArrayList<Integer> empage=new ArrayList<Integer>();
		
		Scanner sc= new Scanner(System.in);  //block for dynamic entry of Arraylist
		System.out.println("enter the number of employees");
		int limit=sc.nextInt();
		for(int i=0; i<limit; i++) {
			System.out.println("enter employee name");
			empname.add(sc.next());
			System.out.println("enter employee age");
			empage.add(sc.nextInt());
		}
/*		
        empname.add("Sachin");
		empname.add("Albert");
		empname.add("Sanju");
		System.out.println("list name before removing " +empname); //this will only display the arraylist as a single block
		empname.remove(1); //this will remove the entry at index 1 ("Albert")
		System.out.println("List name after removing " + String.valueOf(empname));
		empname.set(0, "Arun");
		System.out.println("List name after change " + String.valueOf(empname));
		
*/		
		//to sort arraylist use Collections.sort(empname);
		//to sort in reverse order collection.reverseOrder(empname);
		//to check if a particular entry is present in the arraylist: empname.contains("sachin"); this will always give a boolean output . usually used in if conditions
		//Displaying ArrayList
		//method 1
		System.out.println("empname arraylist");  //using iterator
		Iterator itr=empname.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//method 2
		System.out.println("empage arraylist"); //using for each loop
		for (int i:empage) { //this the for each loop
			System.out.println(i);
		}
	}

}
