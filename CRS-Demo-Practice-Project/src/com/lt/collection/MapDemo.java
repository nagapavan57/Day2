package com.lt.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
	public static void main(String[] args) {
		// Map is Very dynamic collection which can hold the data in the form of
		// key and pair.
		// key Always be unique in the data structure and value can be duplicate

		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();

		TreeMap<Integer, String> hm = new TreeMap<Integer, String>();

		hm1.put(101, "MALE");
		hm1.put(102, "DELHI");
		hm1.put(103, "New York");
		hm1.put(103, "Dubai");
		hm1.put(101, "LONDON");

		hm.put(102, "MALDIVES");
		hm.put(101, "MALDIVES");
		hm.put(106, "UK");
		hm.put(105, "US");

		for (Map.Entry m : hm1.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
