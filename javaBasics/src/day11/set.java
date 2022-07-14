package day11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class set {

	public static void main(String[] args) {
		// set does not allow duplicate values
		//HashSet  null value is allowed, used mainly for search operation, there are no insertion order, default capacity is 16
		//HashSet declaration
		HashSet<String> hset = new HashSet<String>();
		//adding elements to the HashSet
		hset.add("Apple");
		hset.add("Mango");
		hset.add("Orange");
		hset.add("Grape");
		hset.add("Fig");
		
		//adding duplicate elements
		hset.add("Orange");
		hset.add("Mango");
		//displaying HashSet elements
		System.out.println(hset);
		
		//displaying using iterator
		Iterator<String> it = hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//displaying using for loop
		for(String temp : hset) {
			System.out.println(temp);
		}
		
		
		///array list to hashset
		ArrayList<String> al = new ArrayList<String>();
		al.add("Tony");
		al.add("Sachin");
		al.add("Albert");
		al.add("Tony");
		al.add("Sachin");
		HashSet<String> hset1 = new HashSet<String>(al);
		System.out.println(hset1);
		//Linked HashSet  insertion order
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		lhset.add("Z");
		lhset.add("A");
		lhset.add("C");
		lhset.add("F");
		System.out.println(lhset);
		
		//TreeSet   sorted set
		TreeSet<String> tset= new TreeSet<String>();
		//adding elements
		tset.add("ABC");
		tset.add("seb");
		tset.add("Tony");
		tset.add("KGF");
		System.out.println(tset);
		
	}

}
