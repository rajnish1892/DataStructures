package com.datastructure.sorting;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

	public List<Integer> sortNumber(List<Integer> list){
		return null;
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
