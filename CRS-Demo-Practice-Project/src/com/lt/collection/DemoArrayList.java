package com.lt.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// Array List is a kind of Implementation which can contain duplicate
		// objects
		List<String> list = new ArrayList<String>();
		System.out.println(list.size());
		list.add("Mumbai");
		list.add("Pune");
		list.add("Hyd");
		list.add("Blr");
		list.add("Mumbai");
		list.add("Delhi");
		System.out.println(list.size());

		list.remove("Mumbai");
		System.out.println("Size After Removal  " + list.size());

		// Iterable interface

		// Iterator is interface which is using to iterate the Collection
		Iterator<String> i = list.iterator();
		while (i.hasNext()) {

			String test = i.next();
			System.out.println("detals of Capital------>" + test);
		}

		// Another way to iterate the collection using for loop

		// Loop through elements.
		for (String value : list) {

			System.out.println("Element: " + value);
		}

	}

}
