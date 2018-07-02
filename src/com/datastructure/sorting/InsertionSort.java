package com.datastructure.sorting;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

	public List<Integer> sortNumber(List<Integer> lst) {
		for (int i = 0; i < lst.size() - 1; i++) {
			int pointer = i + 1;
			int pointerValue = lst.get(pointer);
			int swapLocation = 0;
			while (pointer != 0) {
				System.out.println(lst + "  " + swapLocation + " " + pointer);

				if ( pointerValue < lst.get(pointer - 1) ) {
					lst.set(pointer, lst.get(pointer - 1));
					pointer--;
				} else {
					swapLocation = pointer;
					break;
				}

			}
			lst.set(swapLocation, pointerValue);
			 System.out.println(lst+"  "+swapLocation+" "+pointer);
		}
		return lst;
	}

	public static void main(String a[]) {
		InsertionSort insertionSort = new InsertionSort();
		List<Integer> integerList = new ArrayList<Integer>();
		integerList.add(7);
		integerList.add(3);
		integerList.add(5);
		integerList.add(9);
		integerList.add(0);
		integerList.add(4);
		System.out.println("Started");
		insertionSort.sortNumber(integerList);
	}
}
