package com.datastructure.sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rajnish.p.kumar
 *
 *
 *The selection sort works by repeatedly going through the list of items,
 * each time selecting an item according to its ordering and placing 
 * it in the correct position in the sequence.
 *The main advantage of the selection sort is that 
 *it performs well on a small list. Furthermore, 
 *because it is an in-place sorting algorithm, 
 *no additional temporary storage is required beyond 
 *what is needed to hold the original list. 
 *The primary disadvantage of the selection sort is its poor efficiency 
 *when dealing with a huge list of items. Similar to the bubble sort,
 * the selection sort requires n-squared number of steps for sorting n elements.
 *  Additionally, its performance is easily influenced by the initial ordering 
 *  of the items before the sorting process. Because of this, 
 *  the selection sort is only suitable for a list of few elements 
 *  that are in random order.
 */
public class SelectionSort {
	public List<Integer> sortNumber(List<Integer> lst) {
		
		for (int i = 0; i < lst.size(); i++) {
			int currentMin = lst.get(i);
			int location = i;
			for (int j = i + 1; j < lst.size(); j++) {
				if (currentMin > lst.get(j)) {
					currentMin = lst.get(j);
					location = j;
				}
			}
			System.out.println(lst+"  "+currentMin);
			if(location!=i){
			lst.set(location, lst.get(i));
			lst.set(i, currentMin);
			}
		}
		return null;
	}
	
	public static void main(String a[]){
		SelectionSort selectionSort = new SelectionSort();
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(7);
		integerList.add(3);
		integerList.add(5);
		integerList.add(9);
		integerList.add(0);
		integerList.add(4);
		System.out.println("Started");
		selectionSort.sortNumber(integerList);
	}
}
