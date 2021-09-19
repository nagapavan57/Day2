package com.lt.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// Set is An interface which is implementing a treeset or hashset based
		// implementation
		// Set won't be allow Any Duplicate Element in the collection
		// It will Randomly do Manipulation of collection
		// TreeSet Always Print the value in Sorted order
		int count[] = { 34, 22, 10, 60, 30, 22 };

		Set set = new HashSet();

		try {
			for (int i = 0; i <= 5; i++) {
				set.add(count[i]);
			}
			System.out.println(set);

			TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
			System.out.println("The sorted list is:");

			System.out.println(sortedSet);

			System.out.println("The First element of the set is: "
					+ (Integer) sortedSet.first());

			System.out.println("The last element of the set is: "
					+ (Integer) sortedSet.last());

		} catch (Exception e) {

			System.out.println(" in exception Class" + e.getMessage());
		}

	}

}
