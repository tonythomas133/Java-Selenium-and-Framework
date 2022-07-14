package day11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class map {//key value pair
	public static void main(String[] args) {
		// HashMap  no order
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		//adding elements in hashmap
		hmap.put(12,  "Tony");
		hmap.put(2, "Rahul");
		hmap.put(3, "Anooj");
		hmap.put(7, "John");
		hmap.put(1, "Ajas");
		System.out.println("Hash Map" + "\n");
		System.out.println(hmap);
		//Display content using iterator
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.println("key is: " + mentry.getKey() + " & value is: " +mentry.getValue());
		}
		
		//linkedHashmap insertion order
		LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
		lhmap.put(22, "Abbey");
		lhmap.put(33, "Dawn");
		lhmap.put(1, "Sherry");
		lhmap.put(2, "Karen");
		lhmap.put(100, "Jim");
		lhmap.put(125, "James");
		System.out.println("Linked Hash Map");
		System.out.println(lhmap);
		//generating a set of entries
		Set set2 = lhmap.entrySet();
		//displaying using for loop
		for(Map.Entry me:lhmap.entrySet()) {
			System.out.println("Key is: " + me.getKey() + " & value is: "+me.getValue());
		}
		
		
		//TreeMap sorted order 
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(1, "Data1");
		tmap.put(2, "Data2");
		tmap.put(3, "Data3");
		tmap.put(4, "Data4");
		tmap.put(5, "Data5");
		System.out.println("Tree Map");
		System.out.println(tmap);
		//display content using iterator
		Set set1 = tmap.entrySet();
		Iterator iterator1= set1.iterator();
		while( iterator1.hasNext()) {
			Map.Entry mentry1 = (Map.Entry)iterator1.next();
			System.out.println("key is: " + mentry1.getKey() + " & value is: " + mentry1.getValue());
		}

	}

}
